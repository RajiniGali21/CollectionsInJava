package com.kn.ComplexSorting;
public class Student{
//public class Student implements Comparable{
//	USing comparable interface
//	@Override
//	public int compareTo(Object o) 
//	{
//		if(this.id>((Student)(o)).id)
//		{
//			return 1;
//		}
//		else if(this.id<((Student)(o)).id)
//		{
//			return -1;
//		}
//		else 
//		{
//		return 0;
//		}
//	}
	int id;
	String name;
	double percent;
	
	public Student(int id, String name, double percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}
	
	

}
