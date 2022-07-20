package com.monocept.testLinkedList;

import java.util.Scanner;

import com.monocept.model.DoubleLinkedList;

public class DoubleLinkedListTest {

	static DoubleLinkedList dlist = new DoubleLinkedList();

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.print("Enter how many nodes:");
		int given = scan.nextInt();
		for (int i = 0; i < given; i++)
			dlist.insertionAtend();

		while (flag) {

			System.out.println("\n............choose operation................");
			System.out.println(" {1} Insertions/ {2} Deletions/ {0} Exit ");
			System.out.print("Enter your choice:");
			switch (scan.nextInt()) {
			case 1:
				AdditionMethods();
				break;
			case 2:
				deletionMethods();
				break;
			case 0:
				flag = false;
				System.out.println("You are now exit.");
				break;
			default:
				System.out.println("Please enter Valid input");
			}
		}

	}

	private static void AdditionMethods() {
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
			switch (scan.nextInt()) {
			case 0:
				flag = false;
				System.out.println("You are exit for Insertion operations");
				break;
			case 1:
				dlist.printlist();
				break;
			case 2:
				dlist.insertionAtBegin();
				break;
			case 3:
				dlist.insertionAtend();
				break;
			case 4:
				dlist.insertionAtMiddle();
				break;
			case 5:
				dlist.insertionAtIndex();
				break;
			case 6:
				dlist.insertionAtGivenBefore();
				break;
			case 7:
				dlist.insertionAtGivenAfter();
				break;
			default:
				System.out.println("Please enter Valid input");

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
			switch (scan.nextInt()) {
			case 0:
				flag = false;
				System.out.println("You are now exit for Deletion operations.");
				break;
			case 1:
				dlist.printlist();
				break;
			case 2:
				dlist.deletionAtBegin();
				break;
			case 3:
				dlist.deletionAtEnd();
				break;
			case 4:
				dlist.deletionAtMiddle();
				break;
			case 5:
				dlist.deletionAtIndex();
				break;
			case 6:
				dlist.deletionAtGiven();
				break;
			case 7:
				dlist.deletionAtGivenBefore();
				break;
			case 8:
				dlist.deletionAtGivenAfter();
				break;
			default:
				System.out.println("Please enter Valid input");
			}
		}

	}

}
