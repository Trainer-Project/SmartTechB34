package com.usa.abstractions;

public class AbstractRegularClass extends AbstractA {

	@Override
	public void getAbstract() {
		
		System.out.println("I am the abstract method");
		
		
	}
	
public static void main(String[] args) {
	AbstractRegularClass obj = new AbstractRegularClass();
	obj.getAbstract();
	obj.getName();
	obj.getSalary();
	
}
}
