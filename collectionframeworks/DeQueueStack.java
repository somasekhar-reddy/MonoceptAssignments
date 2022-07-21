package com.monocept.mapinterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DeQueueStack {
	private static Deque<Integer> dq = new ArrayDeque<>();
	private static int size = 4;
	private static int top = 0;

	public static void pop() {
		if (dq.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(dq.peekLast());
			dq.removeLast();
		}

	}

	public static void push() {
		System.out.print("Enter element:");
		if (dq.size() != size) {
			dq.offerLast(new Scanner(System.in).nextInt());

		} else
			System.out.println("Stack is OverFlow");
	}

	public static void peek() {
		if (!dq.isEmpty())
			System.out.println(dq.getLast());
		else {
			System.out.println("Stack is UnderFlow");
		}
	}

	public static void main(String[] args) {
		int decision;

		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while (flag) {
			System.out.println("1 for peek element");
			System.out.println("2 for push element");
			System.out.println("3 for pop element");
			System.out.println("4 for Size of the stack");
			System.out.println("5 for print whole stack");
			System.out.println("any entry for Exit");

			System.out.print("Choice :");
			decision = scan.nextInt();
			switch (decision) {
			case 1:
				peek();
				break;

			case 2:
				push();
				break;

			case 3:
				pop();
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