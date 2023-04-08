package com.usa.inheritance;

public class ChildClass extends Parents {

	public void getCar() {
		System.out.println("Child Property -> Rakib has a car 2024 model BMW M");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.getCar();
		obj.getGrandParentProperties();
		obj.getMarried();

	}
}
