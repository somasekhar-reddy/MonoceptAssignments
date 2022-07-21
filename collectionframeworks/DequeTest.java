package com.monocept.collectionsTest;

import java.util.ArrayDeque;
import java.util.Deque;

class DequeTest {
	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();
		deque.add("somu");
		deque.addFirst("sekhar");
		deque.addLast("pulicherla");
		deque.offer("what");
		deque.offerFirst("mohan");
		deque.offerLast("murali");
		System.out.println(" get first:" + deque.getFirst());
		System.out.println(" get last:" + deque.getLast());
		System.out.println(" get first:" + deque.peekFirst());
		System.out.println(" get first:" + deque.peekLast());
		deque.remove();
		deque.removeFirst();
		deque.removeLast();
		deque.pollLast();
		deque.pollFirst();
		System.out.println("size :" + deque.size());
		System.out.println("isempty: " + deque.isEmpty());
	}

}
