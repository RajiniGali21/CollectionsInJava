package com.kn.ComplexSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1  = new Student(16,"Sriya",80.0);
		Student s2 = new Student(2,"Rajini",60.0);
		
//		String str = new String("dummy string");
//		
//		System.out.println(str);
//		System.out.println(s1);
//		System.out.println(s2.toString());
		ArrayList<Student> std = new ArrayList<>();
		std.add(s1);
		std.add(s2);
		System.out.println("before sorting");
		System.out.println(std);
//		using comparable interface
//		Collections.sort(std);
		
//		using comparator interface
//		SortStudentById s = new SortStudentById();
//		Collections.sort(std,s);
//		Another Method for Comparator interface
//		SOrting based on id
//		Collections.sort(std,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) 
//			{
//				if(s1.id>s2.id)
//				{
//					return 1;
//				}
//				else if(s1.id<s2.id)
//				{
//					return -1;
//				}
//				else 
//				{
//					return 0;
//				}
//			
//			}
//		});
//		Sorting based on name
		Collections.sort(std,new Comparator<Student>() {
			public int compare(Student s1,Student s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
		});
//		sorting based on percent
//		Collections.sort(std,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) 
//			{
//				if(s1.percent>s2.percent)
//				{
//					return 1;
//				}
//				else if(s1.percent<s2.percent)
//				{
//					return -1;
//				}
//				else 
//				{
//					return 0;
//				}
//			
//			}
//		});
		
		System.out.println("After sorting");
		System.out.println(std);
		
		
	}

}
