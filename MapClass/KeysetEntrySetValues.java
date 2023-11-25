package com.kn.MapClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
//

public class KeysetEntrySetValues {

	public static void main(String[] args) 
	{
		HashMap map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 300);
		map.put("three", new Student(3,"Akash",7.8));
		map.put(4, 200);
		System.out.println(map);
//		Accesing keys only using keyset() method which returns a set object
		Set key = map.keySet();
		System.out.println(key);
//		Accesing key-value pair only using entryset() method which returns a set object
		Set keyvalue = map.entrySet();
		System.out.println(keyvalue);
//		Accesing values only using values() method which returns a collection object
		Collection values = map.values();
		System.out.println(values);
		}


	

}
