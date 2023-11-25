package com.kn.MapClass;

import java.util.LinkedHashMap;

public class LinkedhashmapDemo {

	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap<>();
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 400);
		map.put("four", new Student(1, "aju", 9.0));
		map.put(5, 700);
		map.put("six", new Student(2, "Ammu", 8.1));
		System.out.println(map);
	}
}
