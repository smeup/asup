/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.base;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Implementation of a blocking queue, one that always "contains" elements. If
 * it is in fact empty, the poll() and peek() method will block until an item is
 * pushed or a timeout is elapsed.
 */
public class BaseBlockingFifoQueue<E> extends BaseBlockingQueue<E> {

	private BlockingQueue<E> queue = null;

	public BaseBlockingFifoQueue(BlockingQueue<E> queue) {
		super();
		this.queue = queue;
	}

	/**
	 * Puts object in queue.
	 */
	public void put(E o) {
		queue.offer(o);
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
	 * Returns the element on top of the queue. Unlike the poll() method, this
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
	public E poll(long timeout) throws InterruptedException {

		E element = null;
		if(timeout == -1)
			element = queue.take();
		else			
			element = queue.poll(timeout, TimeUnit.MILLISECONDS);
		
		return element;
	}

	/**
	 * Returns the element on top of the queue, without polling it.
	 *
	 * @return
	 * @throws InterruptedException
	 */
	public E peek() throws InterruptedException {
		return queue.peek();
	}

	public void clear() {
		queue.clear();
	}

	/**
	 * Returns <code>true</code> if queue is empty, otherwise <code>false</code>
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}