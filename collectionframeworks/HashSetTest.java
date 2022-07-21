package com.monocept.collectionsTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		System.out.println("Set size : " + set.size());
		System.out.println("set is empty :" + set.isEmpty());
		System.out.println("contains 3 :" + set.contains(3));
		Set<Integer> set2 = new HashSet<>();
		set2.add(9);
		set2.add(2);
		System.out.println("contains set :" + set.containsAll(set2));
		System.out.println("addall from set2 :" + set.addAll(set2));
		System.out.println("remove 3 :" + set2.remove(9));
		set2.clear();
		set2.removeAll(set2);
		System.out.println("remove all set2 : " + set2.toString());
		System.out.println("for each loop:");
		for (Integer i : set)
			System.out.print(i + ",");

		System.out.println("\n to string :" + set.toString());
		System.out.print("iterator: ");

		Iterator<Integer> j = set.iterator();
		while (j.hasNext()) {
			System.out.print(j.next() + ",");
		}
	}

}
