package com.kn.Wrapperclass;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BackwardTraversingInWrapperClass {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(300);
		Iterator itr = ad.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
