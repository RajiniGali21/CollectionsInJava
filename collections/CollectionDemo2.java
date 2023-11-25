package com.kn.collections;
import java.util.*;
public class CollectionDemo2 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add("ten");
		ad.add(true);
		
		System.out.println(ad);
		System.out.println("first = "+ad.getFirst());
		System.out.println("last = "+ad.getLast());
	
		ad.addFirst(1111);
		ad.addLast(999);
		System.out.println(ad);
		System.out.println("first = "+ad.getFirst());
		System.out.println("last = "+ad.getLast());
	}
}
