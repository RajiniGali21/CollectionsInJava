package com.kn.UpcastingWithCollectionObject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Upcasting {
//	Upcasting with collection objects

	public static void main(String[] args) {
		List list1 = new ArrayList();	
		list1.add(20);
		list1.add(30);
		System.out.println("array list elements are =");
		System.out.println(list1);
		
		List list2 = new LinkedList();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		System.out.println("linked list elements are = ");
		System.out.println(list2);
		
		Queue que = new ArrayDeque();
		que.add(30);
		que.add(50);
		System.out.println("array deque elemenets are = ");
		System.out.println(que);
		
		Queue que2 = new PriorityQueue();
		que2.add(99);
		que2.add(65);
		System.out.println("priority queue elements are = ");
		System.out.println(que2);
			
		
	}

}
