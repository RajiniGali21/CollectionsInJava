package com.kn.traversing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingDemo {

	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<>();
		list.add("shirt");
		list.add("jacket");
		list.add("cap");
		list.add(20);
		list.add(true);
//		USing for loop
		System.out.println("using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
//		.Using for each loop
		System.out.println("using foreach loop");
		for(Object s:list)
		{
			System.out.println(s);
		}
//		Traversing an iterator
//			Using iterator
		System.out.println("using iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
	
			
//			Backward traversing in arraylist
			System.out.println("Backward traversing in arraylist");
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(20);
			list1.add(30);
			list1.add(50);
			ListIterator<Integer> itr1 = list1.listIterator(list1.size());
			while(itr1.hasPrevious())
			{
				System.out.println(itr1.previous()+" ");
			}
	}	
			
		
}
