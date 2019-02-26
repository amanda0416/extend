package com.tom;

public class Staff {
	String name;
	String address;
	int pay;
	
	public Staff (String name,int pay,String address) {
		this.name = name;
		this.pay = pay;
		this.address = address;
	}
	
	public void print() {
		System.out.print(name + "\t" + pay + "\t" + address);
	}
}
