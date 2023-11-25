package com.kn.collections;
import java.util.*;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,11);
		list.set(1,22);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.indexOf(10));
		System.out.println(list.lastIndexOf(10));
		
		
		LinkedList list1 = new LinkedList();
		list1.add("Ten");
		list1.add("Twenty");
		list1.add("Thirty");
		list1.addAll(1,list);
		
		System.out.println(list1);
	}

}
