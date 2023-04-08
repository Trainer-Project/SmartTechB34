package com.usa.polymorphism;

public class MethodOverridingA {
	public void getName() {
		System.out.println("My name is Ana");

	}

	public void getSalary() {
		System.out.println("My salary is 100000");

	}

	public void getProperty() {
		System.out.println("I have Apple Watch");

	}
	public static void main(String[] args) {
		MethodOverridingA obj = new MethodOverridingA();
		obj.getName();
		obj.getSalary();
		obj.getProperty();
		
	}
}
