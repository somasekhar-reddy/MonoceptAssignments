package com.monocept.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeMapTest {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "mohan", 24, 5500), new Employee(1, "murali", 23, 4500),
				new Employee(3, "mohan", 34, 7500), new Employee(5, "mohan", 24, 9500),
				new Employee(4, "rakesh", 64, 11500), new Employee(6, "rohan", 56, 3500), };

		Map<Integer, String> emap = new HashMap<>();

		for (Employee e : employees) {
			if (!emap.containsKey(e.getId()))
				emap.put(e.getId(), e.getName());
		}

		System.out.println("   ID(Key) : Name(Value)");
		for (Entry<Integer, String> entry : emap.entrySet())
			System.out.println("       " + entry.getKey() + "   :   " + entry.getValue());
	}

}
