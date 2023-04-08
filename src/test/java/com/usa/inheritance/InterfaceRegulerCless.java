package com.usa.inheritance;

public class InterfaceRegulerCless implements InterFaceA, InterFaceB{

	public void getJob() {
		System.out.println("Fahim need IT job badly");
	}
	
	public void getPropertiesB() {
		System.out.println("I am from interface B");
	}

	public void getPropertiesA() {
		System.out.println("I am from interface A");

	}
	public static void main(String[] args) {
		InterfaceRegulerCless obj = new InterfaceRegulerCless();
		obj.getPropertiesA();
		obj.getPropertiesB();
		obj.getJob();
	}
	

}
