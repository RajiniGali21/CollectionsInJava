package com.kn.collections;
import java.util.*;
public class CollectionsDemo3 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(400);
		pq.add(4);
		System.out.println(pq);
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("two");
		pq1.add("twenty");
		pq1.add("thirty");
		System.out.println(pq1);
	}
}
