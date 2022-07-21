package com.monocept.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountFrequency {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 6, 3, 4, 7, 5, 9, 7, 8, 9, 0, 9, 9 };
		List<Integer> list = new ArrayList<>();
		for (int i : arr)
			list.add(i);

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer element : list) {

			map.put(element, map.getOrDefault(element, 0) + 1);
		}

		System.out.println("Keys(element) : Values(frequencies)");
		for (Entry<Integer, Integer> entry : map.entrySet())
			System.out.println("      " + entry.getKey() + "  :  " + entry.getValue());
	}

}
