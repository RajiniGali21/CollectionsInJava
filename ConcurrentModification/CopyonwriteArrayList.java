package com.kn.ConcurrentModification;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwriteArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		int temp=40;
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
			list.add(temp+=10);
		}
	}

}
