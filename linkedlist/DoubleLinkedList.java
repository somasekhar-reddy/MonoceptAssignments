package com.monocept.model;

import java.util.Scanner;

public class DoubleLinkedList {

	private static Scanner t = new Scanner(System.in);
	private Node head = null;
	private Node temp = null;
	private Node tail = null;

	private class Node {
		int data;
		Node next;
		Node before;

		Node(int i) {
			data = i;
			next = null;
			before = null;
		}
	}

	public void setHeader(Node h) {
		head = h;
	}

	public Node getHeadder() {
		return head;
	}

	public void insertionAtBegin() {

		System.out.print("Enter your data :");
		Node newNode = new Node(t.nextInt());
		if (head == null)
			head = newNode;
		else {
			head.before = newNode;
			newNode.next = head;
			head = newNode;
		}

	}

	public void insertionAtend() {
		System.out.print("Enter your data :");
		Node newNode = new Node(t.nextInt());
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.before = tail;
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void insertionAtMiddle() {
		Node temp2 = head;
		int count = 0, newcount = 0;
		while (temp2 != null) {
			count++;
			temp2 = temp2.next;
		}
		temp2 = head;
		while (newcount < (count / 2)) {
			temp2 = temp2.next;
			newcount++;
		}
		if (count == 0)
			insertionAtBegin();
		else if (head.next == null)
			insertionAtend();
		else
			middleAdd(temp2.before);

	}

	public void middleAdd(Node temp2) {
		System.out.print("Enter your data :");
		Node newNode = new Node(t.nextInt());
		newNode.next = temp2.next;
		newNode.before = temp2;
		temp2.next = temp2.next.before = newNode;
	}

	public void insertionAtIndex() {
		Node temp2 = head;
		int index, newindex = 0;
		System.out.print("Enter index no:");
		index = t.nextInt();
		while (temp2 != null && index > newindex) {
			newindex++;
			temp2 = temp2.next;
		}

		if (index == 0)
			insertionAtBegin();
		else if (temp2 == null && index == newindex)
			insertionAtend();
		else if (temp2 == null)
			System.out.println("The index is out of range.");
		else
			middleAdd(temp2.before);
	}

	public void printlist() {
		System.out.println("Your Final Doubly Linked list :");
		Node temp = head;
		if (temp == null)
			System.out.println("Its a empty list");
		else
			while (temp != null) {
				System.out.print(temp.data + ",");
				temp = temp.next;
			}

	}

	public void insertionAtGivenBefore() {
		Node temp2 = head;
		int given;
		System.out.print("Enter data for search:");
		given = t.nextInt();
		while (temp2 != null) {
			if (temp2.data == given) {
				break;
			}
			temp2 = temp2.next;
		}
		if (head == null)
			System.out.println("The list is empty,Even to search.");
		else if (head.data == given)
			insertionAtBegin();
		else if (temp2 == null)
			System.out.println("We couldn't find any data,try to search another.");
		else {
			middleAdd(temp2.before);
		}
	}

	public void insertionAtGivenAfter() {
		Node temp2 = head;
		int given;
		if (head == null)
			System.out.println("The list is empty,Even to search.");
		else {
			System.out.print("Enter data for search:");
			given = t.nextInt();
			while (temp2 != null) {
				if (temp2.data == given) {
					break;
				}
				temp2 = temp2.next;
			}
			if (tail.data == given)
				insertionAtend();
			else if (temp2 == null)
				System.out.println("We couldn't find any data,try to search another.");
			else
				middleAdd(temp2);
		}
	}

	public void deletionAtBegin() {
		Node binNode = null;
		if (head == null) {
			System.out.println("List is empty to deletion.");
		} else {
			binNode = head;
			head = head.next;
			if (head != null)
				head.before = null;
			binNode = null;
		}
	}

	public void deletionAtEnd() {
		Node binNode = null;
		if (head == null)
			System.out.println("the list is empty to deletion.");
		else {

			if (head.next == null)
				head = tail = null;
			else {
				binNode = tail;
				tail = tail.before;
				binNode = tail.next = null;
			}
		}
	}

	public void deletionAtMiddle() {
		Node temp2 = head;
		Node binNode;
		int count = 0, newcount = 0;
		while (temp2 != null) {
			count++;
			temp2 = temp2.next;
		}
		temp2 = head;
		while (newcount < (count / 2)) {
			temp2 = temp2.next;
			newcount++;
		}
		if (head == null)
			System.out.println("The list is empty to deletion.");
		else if (head.next == null)
			deletionAtBegin();
		else if (head.next.next == null)
			deletionAtEnd();
		else {
			middleDelete(temp2);
		}
	}

	public void deletionAtIndex() {
		Node temp2 = head;
		Node binNode = null;
		int index, newIndex = 0;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the index--:");
			index = t.nextInt();
			while (temp2.next != null && newIndex != index) {
				newIndex++;
				temp2 = temp2.next;
			}
			if (index == 0)
				deletionAtBegin();
			else if (index >= ++newIndex) {
				System.out.println("The index is out of range.");
			} else if (temp2.next == null && index == newIndex - 1)
				deletionAtEnd();
			else {
				middleDelete(temp2);
			}
		}
	}

	public void deletionAtGivenBefore() {
		Node temp2 = head;
		Node binNode = null;
		int given;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the data for deletion :");
			given = t.nextInt();
			if (head.data == given) {
				System.out.println("Its not possible to deletion.");
			} else if (head.next.data == given) {
				deletionAtBegin();
			} else {
				temp2 = temp2.next.next;
				while (temp2 != null && given != temp2.data) {
					temp2 = temp2.next;
				}
				if (temp2 == null)
					System.out.println("we couldn't found the given data.");
				else {
					middleDelete(temp2.before);
				}
			}
		}
	}

	public void deletionAtGiven() {
		Node temp2 = head;
		Node binNode = null;
		int given;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the data for deletion :");
			given = t.nextInt();

			while (temp2 != null && given != temp2.data) {
				temp2 = temp2.next;
			}
			if (temp2 == null) {
				System.out.println("we couldn't found the given data.");
			} else if (temp2.next == null) {
				deletionAtEnd();
			} else if (head.data == given) {
				deletionAtBegin();
			} else {
				middleDelete(temp2);
			}

		}
	}

	public void deletionAtGivenAfter() {
		Node temp2 = head;
		Node binNode = null;
		int given;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the data for deletion :");
			given = t.nextInt();

			while (temp2 != null && given != temp2.data) {
				temp2 = temp2.next;
			}
			if (temp2 == null) {
				System.out.println("we couldn't found the given data.");
			} else if (temp2.next == null) {
				System.out.println("Its not possible to deletion");
			} else if (temp2.next.next == null) {
				deletionAtEnd();
			} else {
				middleDelete(temp2.next);
			}

		}
	}

	public void middleDelete(Node temp2) {
		Node binNode = temp2;
		temp2.before.next = temp2.next;
		temp2.next.before = temp2.before;
		binNode = null;

	}

}
