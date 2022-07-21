package com.monocept.collectionsTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<Integer> lukkyNumbers = new LinkedList<>();

		lukkyNumbers.add(1);
		lukkyNumbers.add(2);
		lukkyNumbers.add(3);
		lukkyNumbers.add(4);
		lukkyNumbers.add(5);
		lukkyNumbers.add(6);
		System.out.println(lukkyNumbers);
		lukkyNumbers.add(0, 9);
		System.out.println("After Index insertion: " + lukkyNumbers);
		System.out.println("After remove index 1:" + lukkyNumbers);
		System.out.println("Element at index 1 : " + lukkyNumbers.get(1));
		System.out.println("Index of 4 : " + lukkyNumbers.indexOf(4));
		System.out.println("Size of the list : " + lukkyNumbers.size());
		System.out.println("IS empty check :" + lukkyNumbers.isEmpty());
		System.out.println("contains 3 :" + lukkyNumbers.contains(3));
		System.out.println("lastIndexof 3 :" + lukkyNumbers.lastIndexOf(3));
		List<Integer> additionals = new LinkedList<>();
		additionals.add(7);
		additionals.add(8);
		lukkyNumbers.addAll(additionals);
		System.out.println("After ADD ALL :" + lukkyNumbers);
		lukkyNumbers.addAll(1, additionals);
		System.out.println("After ADD ALL AT INDEX  1 :" + lukkyNumbers);
		additionals.remove(0);
		additionals.clear();
		System.out.println("AFTer clearing/removeall the Additionals :" + additionals);
		lukkyNumbers.remove(1);
		System.out.println("for each loop:");
		for (Integer i : lukkyNumbers)
			System.out.print(i + ",");

		System.out.println("\n to string :" + lukkyNumbers.toString());
		System.out.print("iterator: ");

		Iterator<Integer> j = lukkyNumbers.iterator();
		while (j.hasNext()) {
			System.out.print(j.next() + ",");
		}

	}

}
