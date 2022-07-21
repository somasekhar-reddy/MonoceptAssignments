package com.monocept.mapinterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DeQueueQueue {

	private static Deque<Integer> dq = new ArrayDeque<>();
	private static int size = 4;

	public static void deQueue() {
		if (dq.isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(dq.peekFirst());
			dq.removeFirst();

		}

	}

	public static void enQueue() {
		System.out.print("Enter element:");
		if (dq.size() != size) {
			dq.offerLast(new Scanner(System.in).nextInt());

		} else
			System.out.println("Queue is OverFlow");
	}

	public static void peek() {
		if (!dq.isEmpty())
			System.out.println(dq.getFirst());
		else {
			System.out.println("Queue is Empty");
		}
	}

	public static void main(String args[]) {
		int decision;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while (flag) {
			System.out.println("1 for peek element");
			System.out.println("2 for Enqueue element");
			System.out.println("3 for Dequeue element");
			System.out.println("4 for Size of the Queue");
			System.out.println("5 for print whole Queue");
			System.out.println("any entry for Exit");

			System.out.print("Choice :");
			decision = scan.nextInt();
			switch (decision) {
			case 1:
				peek();
				break;

			case 2:
				enQueue();
				break;

			case 3:
				deQueue();
				break;

			case 4:
				System.out.println("Size is : " + dq.size());
				break;
			case 5:
				System.out.println("The statck is: " + dq);
				break;
			default:
				flag = false;
			}
			System.out.println();
		}
		System.out.println("you are exit");

	}

}
