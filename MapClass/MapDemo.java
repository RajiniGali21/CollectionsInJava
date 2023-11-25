package com.kn.MapClass;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		Using TreeMap 
		TreeMap map1 = new TreeMap<>();
//		map1.put(1, 100);
//		map1.put(2, 300);
//		map1.put(3, 500);
//		map1.put(4, 200);
//		System.out.println(map1);
		map1.put(1, 100);
		map1.put(2, 300);
//		map1.put("two", 300);[error: ClassCastException]
		map1.put(3, new Student(3,"Akash",7.8));
		map1.put(4, 200);
		System.out.println(map1);
	}

}
