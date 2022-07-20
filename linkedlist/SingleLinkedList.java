package com.monocept.model;

import java.util.Scanner;

public class SingleLinkedList {

	private static Scanner scan = new Scanner(System.in);
	private static Node head = null;
	private Node temp = null;

	private class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void setHeader(Node h) {
		head = h;
	}

	public Node getHeader() {
		return head;
	}

	public void addNode(int pin) {
		if (pin == 0)
			System.out.print("Enter data for insertion:");
		else
			System.out.print("Enter [" + pin + "] :");

		Node newNode = new Node(scan.nextInt());
		if (head == null) {
			head = newNode;
			temp = head;
		} else {
			temp.next = newNode;
			temp = newNode;
		}
	}

	public void insertionAtBegin() {
		System.out.print("Enter data for insertion:");
		Node newNode = new Node(scan.nextInt());
		newNode.next = head;
		head = newNode;
		if (head.next == null)
			temp = head;

	}

	public void insertionAtMiddle() {
		Node temp2 = head;
		Node prev = null;
		int count = 0, newcount = 0;
		while (temp2 != null) {
			count++;
			temp2 = temp2.next;
		}
		temp2 = head;
		while (newcount < (count / 2)) {
			prev = temp2;
			temp2 = temp2.next;
			newcount++;
		}
		if (count == 0)
			insertionAtBegin();
		else if (head.next == null) {
			insertionAtBegin();
		} else
			middleAdd(prev);

	}

	public void printlist() {
		Node temp1 = head;
		System.out.print("Your final Linked list :");
		if (head == null)
			System.out.print(" List is Empty");
		else
			while (temp1 != null) {
				System.out.print(temp1.data + ",");
				temp1 = temp1.next;
			}
	}

	public void insertionAtIndex() {
		Node temp2 = head;
		Node prev = null;
		int index, newindex = 0;
		System.out.print("Enter index no:");
		index = scan.nextInt();
		while (temp2 != null && index > newindex) {
			newindex++;
			prev = temp2;
			temp2 = temp2.next;
		}

		if (index == 0)
			insertionAtBegin();
		else if (prev.next == null && index == newindex) {
			temp = prev;
			addNode(0);
		} else if (prev.next == null)
			System.out.println("The index is out of range.");
		else
			middleAdd(prev);

	}

	public void middleAdd(Node prev) {
		System.out.println("Enter data for insertion:");
		Node newNode = new Node(scan.nextInt());
		newNode.next = prev.next;
		prev.next = newNode;
	}

	public void insertionAtGivenBefore() {
		Node temp2 = head;
		Node prev = null;
		int given;
		System.out.print("Enter data for search:");
		given = scan.nextInt();
		while (temp2 != null) {
			if (temp2.data == given) {
				break;
			}
			prev = temp2;
			temp2 = temp2.next;
		}
		if (head == null)
			System.out.println("The list is empty,Even to search.");
		else if (head.data == given)
			insertionAtBegin();
		else if (temp2 == null)
			System.out.println("We could find any data,try to search another.");
		else {
			middleAdd(prev);
		}

	}

	public void insertionAtGivenAfter() {
		Node temp2 = head;
		int given;

		if (head == null)
			System.out.println("The list is empty,Even to search.");
		else {
			System.out.print("Enter data for search:");
			given = scan.nextInt();
			while (temp2 != null) {
				if (temp2.data == given) {
					break;
				}
				temp2 = temp2.next;
			}
			if (head.data == given) {
				addNode(0);
			} else if (temp2 == null)
				System.out.println("We could find any data,try to search another.");
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
			binNode = null;
		}
	}

	public void deletionAtEnd() {
		Node binNode = null;
		Node temp2 = head;
		if (head == null)
			System.out.println("the list is empty to deletion.");
		else {
			while (temp2.next != null) {
				binNode = temp2;
				temp2 = temp2.next;
			}
			if (head.next == null)
				head = null;
			else
				binNode.next = null;
			temp = binNode;
			temp2 = null;
		}
	}

	public void deletionAtMiddle() {
		Node temp2 = head;
		Node prev = null;
		int count = 0, newcount = 0;
		while (temp2 != null) {
			count++;
			temp2 = temp2.next;
		}
		temp2 = head;
		while (newcount < (count / 2)) {
			prev = temp2;
			temp2 = temp2.next;
			newcount++;
		}
		if (head == null)
			System.out.println("The list is empty to deletion.");
		else if (head.next == null)
			deletionAtBegin();
		else {
			prev.next = temp2.next;
			temp2 = null;
		}
	}

	public void deletionAtIndex() {
		Node temp2 = head;
		Node prev = null;
		Node binNode = null;
		int index, newIndex = 0;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.println("Enter the index:");
			index = scan.nextInt();
			while (temp2.next != null && newIndex != index) {
				newIndex++;
				prev = temp2;
				temp2 = temp2.next;
			}
			if (index == 0)
				deletionAtBegin();
			else if (index >= ++newIndex) {
				System.out.println("The index is out of range.");
			} else if (temp2.next == null && index == newIndex)
				prev.next = null;

			else {
				prev.next = temp2.next;
			}
			binNode = temp2;
			binNode = null;
		}
	}

	public void deletionAtGiven() {
		Node temp2 = head;
		Node binNode = null;
		Node prev = null;
		int given;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the data for deletion :");
			given = scan.nextInt();
			while (temp2 != null && given != temp2.data) {
				prev = temp2;
				temp2 = temp2.next;
			}
			if (head.data == given) {
				head = head.next;
			} else if (temp2 == null) {
				System.out.println("we couldn't found the given data.");
			} else if (temp2.next == null) {
				prev.next = null;
			} else {
				prev.next = temp2.next;
			}
			binNode = temp2;
			binNode = null;
		}
	}

	public void deletionAtGivenBefore() {
		Node temp2 = head;
		Node binNode = null;
		Node prev = head;
		int given;
		if (head == null) {
			System.out.println("The list is empty to deletion");
		} else {
			System.out.print("Enter the data for deletion :");
			given = scan.nextInt();
			if (head.data == given) {
				System.out.println("Its not possible to deletion.");
			} else if (head.next.data == given) {
				binNode = head;
				head = head.next;
			} else {
				temp2 = temp2.next.next;
				while (temp2 != null && given != temp2.data) {
					prev = prev.next;
					temp2 = temp2.next;
				}
				if (temp2 == null)
					System.out.println("we couldn't found the given data.");
				else {
					prev.next = temp2;
					binNode = prev.next;
				}
				binNode = null;
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
			given = scan.nextInt();

			while (temp2 != null && given != temp2.data) {
				temp2 = temp2.next;
			}
			if (temp2 == null) {
				System.out.println("we couldn't found the given data.");
			} else if (temp2.next == null) {
				System.out.println("Its not possible to deletion");
			} else if (temp2.next.next == null) {
				binNode = temp2.next;
				temp2.next = null;
			} else {
				binNode = temp2.next;
				temp2.next = temp2.next.next;
			}
			binNode = null;
		}
	}

	public int lengthof(Node temp) {
		if (temp == null)
			return 0;
		return 1 + lengthof(temp.next);
	}

	public Node reverse(Node temp) {

		if (temp == null || temp.next == null)
			return temp;
		Node temp2 = reverse(temp.next);
		temp.next.next = temp;
		temp.next = null;
		return temp2;
	}

}
