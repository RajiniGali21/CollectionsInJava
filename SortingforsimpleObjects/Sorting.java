package com.kn.SortingforsimpleObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
//		USing treeset soting
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(40);
		set.add(65);
		set.add(7);
		System.out.println("using treeset = "+set);
		
//		Using collections.sort(obj)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(60);
		list.add(7);
		list.add(76);
		System.out.println("Before sorting = "+list);
		Collections.sort(list);
		System.out.println("After sorting ="+list);
	}

}
