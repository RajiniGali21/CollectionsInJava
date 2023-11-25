package com.kn.collections;
import java.util.ArrayList;
public class CollectionsDemo {

	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		list1.add(40);
		list1.add(50);
//		list1.add(3,1111);
//		System.out.println(list1);
//		System.out.println(list1.size());
//		System.out.println("***********");
//		list1.set(3,10);
//		System.out.println(list1);
//		System.out.println(list1.size());
//		
		System.out.println("********");
//		
//		System.out.println("index of (30) = "+list1.indexOf(30));
//		System.out.println("index of (10) = "+list1.indexOf(10));
//		System.out.println("last index of (10) = "+list1.lastIndexOf(10));
		
		
		ArrayList list2 = new ArrayList();
		list2.add("one");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		
		System.out.println(list1);
		System.out.println("*************");
		System.out.println(list2);
		System.out.println("***********************");
		list2.addAll(2,list1);
		System.out.println(list2);
		
		
		
		
	}

}
