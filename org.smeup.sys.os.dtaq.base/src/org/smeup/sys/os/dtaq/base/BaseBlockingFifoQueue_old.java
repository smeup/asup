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
package org.smeup.sys.os.dtaq.base;

import java.util.LinkedList;

/**
 * Implementation of a blocking queue, one that always "contains" elements. If
 * it is in fact empty, the pop() and peek() method will block until an item is
 * pushed or a timewait is elapsed.
 */
public class BaseBlockingFifoQueue_old<E> {

	private final Object PUSH_LOCK = new String("PUSH");
	private final Object POPLOCK = new String("POP");
	private LinkedList<E> iList = new LinkedList<E>();

	/**
	 * Puts object in queue.
	 */
	public void put(E o) {
		synchronized (PUSH_LOCK) {
			iList.addLast(o);
			synchronized (this) {
				notify();
			}
		}

	}

	/**
	 * Returns the element on top of the queue, if any.
	 *
	 * @return
	 * @throws InterruptedException
	 */
	public E poll() throws InterruptedException {
		return poll(0);
	}

	/**
	 * Returns the element on top of the queue. Unlike the pop() method, this
	 * method does not block for longer than the given amount of milliseconds.
	 * When the given amount of milliseconds have passed, this method will throw
	 * an InterruptedException.
	 *
	 * If aTimeout = -1 wait until a object is push in queue
	 *
	 * @param aTimeout
	 * @return
	 * @throws InterruptedException
	 */
	public E poll(long aTimeout) throws InterruptedException {
		synchronized (POPLOCK) {
			synchronized (this) {
				if (iList.isEmpty()) {
					if (aTimeout == -1)
						wait();
					else
						wait(aTimeout);

					if (iList.isEmpty())
						throw new InterruptedException("Timed out");
				}
			}
		}
		return iList.removeFirst();
	}

	/**
	 * Returns the element on top of the queue, without popping it.
	 *
	 * @return
	 * @throws InterruptedException
	 */
	public E peek() throws InterruptedException {
		return peek(0);
	}

	/**
	 * Returns the element on top of the queue without popping it. Unlike the
	 * peek() method, this method does not block for longer than the given
	 * amount of milliseconds. When the given amount of milliseconds have
	 * passed, this method will throw an InterruptedException.
	 *
	 * If aTimeout = -1 wait until a object is push in queue
	 */

	public E peek(long aTimeout) throws InterruptedException {
		synchronized (POPLOCK) {
			synchronized (this) {
				if (iList.isEmpty()) {
					if (aTimeout == -1)
						wait();
					else
						wait(aTimeout);

					if (iList.isEmpty())
						throw new InterruptedException("Timed out");
				}
			}
			return iList.getFirst();
		}
	}

	public void clear() {
		iList.clear();
	}
}