/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.cdo;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueContent;
import org.smeup.sys.os.dtaq.QDataQueueEntry;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueueFactory;

public class CDODataQueueManagerImpl implements QDataQueueManager {

	private static final long TIMER_STEP = 10;
	private static final long LOCK_TIMER = 10000;

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QLockManager lockManager;

	@Override
	public void createDataQueue(QJobCapability capability, String library, String name, DataQueueType type, int maxEntryLength) {

		QJob job = jobManager.lookup(capability);

		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue == null) {
			// Queue do not exists. Create and register.
			dataQueue = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueue();
			dataQueue.setName(name);
			dataQueue.setDataQueueType(type);
			dataQueue.setMaxEntryLength(maxEntryLength);

			QDataQueueContent content = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueueContent();

			dataQueue.setContent(content);

			// Save queue in register
			resource.save(dataQueue);

			System.out.println(capability + "\t" + "Queue " + name + " created");

		} else
			throw new OperatingSystemRuntimeException("Queue " + name + " already exists in library " + library);
	}

	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, String value) {
		
		QJob job = jobManager.lookup(capability);
		
		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);

		if (dataQueue != null) {

			if (dataQueue.getDataQueueType().equals(DataQueueType.KEYED))
				if (key == null || key.length() == 0)
					throw new OperatingSystemRuntimeException("Queue write error: key not defined while writing in keyed queue " + library + "/" + name);

			// Try to lock queue content (no wait for lock)
			QObjectLocker<QDataQueue> contentLocker = lockManager.getLocker(job.getContext(), dataQueue);
			boolean locked = contentLocker.tryLock(LOCK_TIMER, LockType.WRITE);

			if (locked) {
				// create entry
				QDataQueueEntry entry = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueueEntry();
				entry.setValue(value);

				if (dataQueue.getDataQueueType().equals(DataQueueType.KEYED))
					// Keyed queue
					entry.setKey(key);

				// Register entry in queue (always in first position: LIFO, FIFO
				// and KEYED policy will be managed on reading)
				dataQueue.getContent().getEntries().add(0, entry);

				// Save queue in register
				resource.save(dataQueue);

				// Free write lock
				contentLocker.unlock(LockType.WRITE);

			} else
				throw new OperatingSystemRuntimeException("Queue write error: content write locked");
		}
	}

	@Override
	public String readDataQueue(QJobCapability capability, String library, String name, long timeout, String key, DataQueueSearchType searchType) {

		return readQueue(capability, library, name, timeout, key, searchType, true);
	}

	@Override
	public void clearDataQueue(QJobCapability capability, String library, String name) {

		QJob job = jobManager.lookup(capability);
		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue != null) {
			dataQueue.getContent().getEntries().clear();

			// Clears locks
/*			if (getContentLocker().isLocked(job, dataQueue, ContentLockType.READ_LOCKED) == false)
				getContentLocker().unlock(job, dataQueue, ContentLockType.READ_LOCKED);
			if (getContentLocker().isLocked(job, dataQueue, ContentLockType.WRITE_LOCKED) == false)
				getContentLocker().unlock(job, dataQueue, ContentLockType.WRITE_LOCKED);*/
		} else
			throw new OperatingSystemRuntimeException("Queue do not exist. Queue: " + name + " Lib: " + library, null);
	}

	@Override
	public String peekDataQueue(QJobCapability capability, String library, String name, long timeout, String key, DataQueueSearchType searchType) {

		return readQueue(capability, library, name, timeout, key, searchType, false);

	}

	@Override
	public void deleteDataQueue(QJobCapability capability, String library, String name) {
		QJob job = jobManager.lookup(capability);
		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue != null)
			resource.delete(dataQueue);
	}

	private String readQueue(QJobCapability capability, String library, String name, long timeout, String key, DataQueueSearchType searchType, boolean deleteElement) {

		String result = null;

		QJob job = jobManager.lookup(capability);
		
		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);

		if (dataQueue != null) {

			if (dataQueue.getDataQueueType() == DataQueueType.FIFO)
				// Read FIFO Queue
				result = readFifoLifo(job, dataQueue, timeout, deleteElement);
			else if (dataQueue.getDataQueueType() == DataQueueType.LIFO)
				// Read LIFO Queue
				result = readFifoLifo(job, dataQueue, timeout, deleteElement);
			else
				// Read KEYED queue
				result = readKeyed(job, dataQueue, timeout, deleteElement, key, searchType);
		} else
			throw new OperatingSystemRuntimeException("Queue " + library + "/" + name + " do not exist");

		return result;
	}

	private String readFifoLifo(QJob job, QDataQueue dataQueue, long timeout, boolean deleteElement) {

		QObjectLocker<QDataQueue> contentLocker = lockManager.getLocker(job.getContext(), dataQueue);
		
		String result = null;

		if (timeout == 0 && contentLocker.isLocked(LockType.READ) == false) {

			// If queue is not locked by others, read queue without wait time
			contentLocker.lock(LockType.READ);

			if (dataQueue.getContent().getEntries().isEmpty() == false) {

				int pointer = 0;
				if (dataQueue.getDataQueueType() == DataQueueType.FIFO)
					pointer = dataQueue.getContent().getEntries().size();

				QDataQueueEntry dataQueueEntry = dataQueue.getContent().getEntries().get(pointer);
				result = dataQueueEntry.getValue();

				// delete element
				if (deleteElement)
					dataQueue.getContent().getEntries().remove(dataQueueEntry);
			}
			contentLocker.unlock(LockType.READ);

		} else if (timeout > 0 || timeout == -1) {

			// Wait for a valid entry for timeout msec or until an entry is
			// written in the queue (timeout == -1)
			long timer = timeout == -1 ? Long.MAX_VALUE : timeout;

			// Queue contain already locked by others: wait for unlock

			Object syncObj = new Object();

			while (contentLocker.isLocked(LockType.READ))
				synchronized (syncObj) {
					try {
						syncObj.wait(TIMER_STEP);
						timer = timer - TIMER_STEP;
						if (timer < 0)
							break;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			if (timer > 0 && contentLocker.isLocked(LockType.READ) == false) {

				// Lock queue contain reading
				contentLocker.lock(LockType.READ);

				while (dataQueue.getContent().getEntries().isEmpty())
					synchronized (syncObj) {
						try {
							syncObj.wait(TIMER_STEP);
							timer = timer - TIMER_STEP;
							if (timer < 0)
								break;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				if (dataQueue.getContent().getEntries().isEmpty() == false) {

					int pointer = 0;
					if (dataQueue.getDataQueueType() == DataQueueType.FIFO)
						pointer = dataQueue.getContent().getEntries().size() - 1;

					QDataQueueEntry dataQueueEntry = dataQueue.getContent().getEntries().get(pointer);
					result = dataQueueEntry.getValue();

					// delete element
					if (deleteElement)
						dataQueue.getContent().getEntries().remove(dataQueueEntry);
				}

				// Unlock queue contain reading
				contentLocker.unlock(LockType.READ);
			}
		}
		return result;
	}

	/**
	 * The comparison criteria between the keys of messages on the data queue
	 * and the key data parameter. When the system searches for the requested
	 * key, the entries are searched in ascending order from the lowest value
	 * key to the highest value key until a match is found. If there are entries
	 * with duplicate keys, the entry that was put on the queue first is
	 * received. (FIFO on duplicate keys)
	 * 
	 * Valid values are:
	 * 
	 * GT Greater than LT Less than NE Not equal EQ Equal GE Greater than or
	 * equal LE Less than or equal
	 * 
	 * This parameter is ignored if the length of key data is zero. A value of
	 * blanks is recommended if the length of key data is zero.
	 * 
	 * EXAMPLE:
	 * 
	 * assume a keyed data queue contains these three entries:
	 * 
	 * Physical Entry 3-Character Key 1 GGG 2 XXX 3 AAA
	 * 
	 * If a key order of LE is specified with key data of XXX, entry 3 would be
	 * received (is the first item that match the search rule in FIFO order). If
	 * the same values were specified on a subsequent request, entry 1 would be
	 * received
	 * 
	 * @param job
	 * @param dataQueue
	 * @param timeout
	 * @param deleteElement
	 * @param key
	 * @param searchType
	 * @return
	 */
	private String readKeyed(QJob job, QDataQueue dataQueue, long timeout, boolean deleteElement, String key, DataQueueSearchType searchType) {

		QObjectLocker<QDataQueue> contentLocker = lockManager.getLocker(job.getContext(), dataQueue);
		
		String result = null;

		if (timeout == 0 && contentLocker.isLocked(LockType.READ) == false) {

			// Read queue without wait time

			contentLocker.lock(LockType.READ);

			List<QDataQueueEntry> entries = dataQueue.getContent().getEntries();
			QDataQueueEntry dataQueueEntry = null;

			for (int i = entries.size() - 1; i >= 0; i--) {
				dataQueueEntry = dataQueue.getContent().getEntries().get(i);
				if (matchKey(dataQueueEntry, key, searchType)) {
					result = dataQueueEntry.getValue();

					// delete element
					if (deleteElement)
						entries.remove(dataQueueEntry);

					break;
				}
			}

			contentLocker.unlock(LockType.READ);

		} else if (timeout > 0 || timeout == -1) {

			// Wait for a valid entry for timeout msec or until an entry is
			// written in the queue (timeout == -1)
			long timer = timeout == -1 ? Long.MAX_VALUE : timeout;

			// Queue contain already locked: wait for unlock
			while (contentLocker.isLocked(LockType.READ))
				try {
					wait(TIMER_STEP);
					timer = timer - TIMER_STEP;
					if (timer < 0)
						break;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			if (timer > 0 && contentLocker.isLocked(LockType.READ) == false) {

				// Lock queue contain reading
				contentLocker.lock(LockType.READ);

				List<QDataQueueEntry> entries = dataQueue.getContent().getEntries();
				QDataQueueEntry dataQueueEntry = null;

				boolean iterate = true;

				while (iterate) {

					for (int i = entries.size() - 1; i >= 0; i--) {
						dataQueueEntry = dataQueue.getContent().getEntries().get(i);
						if (matchKey(dataQueueEntry, key, searchType)) {
							result = dataQueueEntry.getValue();

							// delete element
							if (deleteElement)
								entries.remove(dataQueueEntry);

							// Iteration exit condition: item found
							iterate = false;
							break;
						}
					}

					if (iterate)
						try {
							wait(TIMER_STEP);
							timer = timer - TIMER_STEP;
							if (timer < 0)
								// Iteration exit condition: timeout elapsed
								iterate = false;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}

				// Unlock queue contain reading
				contentLocker.unlock(LockType.READ);
			}
		}
		return result;

	}

	private boolean matchKey(QDataQueueEntry dataQueueEntry, String searchedKey, DataQueueSearchType searchType) {

		boolean match = false;

		String entryKey = dataQueueEntry.getKey();

		switch (searchType.getValue()) {

		case DataQueueSearchType.EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) == 0 ? true : false;
			break;

		case DataQueueSearchType.NOT_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) != 0 ? true : false;
			break;

		case DataQueueSearchType.GREATER_THAN_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) > 0 ? true : false;
			break;

		case DataQueueSearchType.LESS_THAN_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) < 0 ? true : false;
			break;

		case DataQueueSearchType.GREATER_THAN_OR_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) >= 0 ? true : false;
			break;

		case DataQueueSearchType.LESS_THAN_OR_EQUAL_VALUE:
			match = entryKey.compareToIgnoreCase(searchedKey) <= 0 ? true : false;
			break;

		default:
			match = false;
			break;
		}

		return match;
	}

	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, QString value) {
		// TODO Auto-generated method stub
		
	}
}
