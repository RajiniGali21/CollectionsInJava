package com.kn.Wrapperclass;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		Auto-Boxing
		list.add(10); 	//list.add(new Integer(10));
		list.add(20);	//list.add(new Integer(20));
		System.out.println("Elemnts = "+list);
//		Auto-Unboxing
		int i1 = list.get(0);	//(int)list.get(0);	
		int i2 = list.get(1);	//(int)list.get(1);	
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
	}

}
