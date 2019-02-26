package com.tom;

public class Student {
	protected String name;
	private int math;
	int engilsh;
	public Student (String name,int math,int english) {
		this.name = name;
		this.math = math;
		this.engilsh = engilsh;
	}
	public void print() {
		System.out.print(name + "\t" + math + "\t" + engilsh);
	}
	public void setMath(int math) {
		if (math <=100 && math >=0) {
			this.math = math;
		}
	}
}
