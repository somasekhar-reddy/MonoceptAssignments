package com.monocept.testLinkedList;

import java.util.Scanner;

import com.monocept.model.SingleLinkedList;

public class LinkedListTest {
	private static SingleLinkedList llist = new SingleLinkedList();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		SingleLinkedList llist = new SingleLinkedList();
		int n, choice, x = 0;
		System.out.print("Enter how many elements:");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			llist.addNode(i);
		}

		while (flag) {
			System.out.println("\n............choose operation................");
			System.out.println(
					" {1} Display          / {2} Insertions / {3} Deletions/\n {4} lengthoftheList / {5}reverseoflist {0} Exit ");
			System.out.print("Enter your choice:");
			switch (scan.nextInt()) {
			case 2:
				additionMethods();
				break;
			case 3:
				deletionMethods();
				break;
			case 0:
				flag = false;
				System.out.println("You are now exit.");
				break;
			case 4:
				System.out.println("the Length of the linkedlist : " + llist.lengthof(llist.getHeader()));
				System.out.println("\nOperation commited");
				break;
			case 5:
				llist.setHeader(llist.reverse(llist.getHeader()));
				System.out.println("\nOperation commited");
				break;
			case 1:
				llist.printlist();
				System.out.println("\nOperation commited");
				break;
			default:
				System.out.println("Enter Valid input");
			}
		}
	}

	private static void additionMethods() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("\n..............choose your choice............");
			System.out.println(" {1} Displaying the List");
			System.out.println(" {2} Insertion at the Begin");
			System.out.println(" {3} Insertion at the End");
			System.out.println(" {4} Insertion at the Middle");
			System.out.println(" {5} Insertion at the Index");
			System.out.println(" {6} Insertion at the Given data before");
			System.out.println(" {7} Insertion at the Given data After");
			System.out.println(" {0} Exit");
			System.out.print("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 0:
				System.out.println("You are exit for Insertion operations");
				flag = false;
				break;
			case 1:
				llist.printlist();
				break;
			case 2:
				llist.insertionAtBegin();
				break;
			case 3:
				llist.addNode(0);
				break;
			case 4:
				llist.insertionAtMiddle();
				break;
			case 5:
				llist.insertionAtIndex();
				break;
			case 6:
				llist.insertionAtGivenBefore();
				break;
			case 7:
				llist.insertionAtGivenAfter();
				break;

			default:
				System.out.println("Please Enter Valid input");
			}
		}

	}

	private static void deletionMethods() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("\n............choose your choice..............");
			System.out.println(" {1} Display the list");
			System.out.println(" {2} Deletion at the Begin");
			System.out.println(" {3} Deletion at the End");
			System.out.println(" {4} Deletion at the Middle");
			System.out.println(" {5} Deletion at the Index");
			System.out.println(" {6} Deletion at the Given data");
			System.out.println(" {7} Deletion at the Given data Before");
			System.out.println(" {8} Deletion at the Given data After");
			System.out.println(" {0} Exit");
			System.out.print("Enter your choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 0:
				System.out.println("You are now exit for Deletion operations.");
				flag = false;
				break;
			case 1:
				llist.printlist();
				break;
			case 2:
				llist.deletionAtBegin();
				break;
			case 3:
				llist.deletionAtEnd();
				break;
			case 4:
				llist.deletionAtMiddle();
				break;
			case 5:
				llist.deletionAtIndex();
				break;
			case 6:
				llist.deletionAtGiven();
				break;
			case 7:
				llist.deletionAtGivenBefore();
				break;
			case 8:
				llist.deletionAtGivenAfter();
				break;
			default:
				System.out.println("Please Enter valid input.");
			}
		}

	}

}
