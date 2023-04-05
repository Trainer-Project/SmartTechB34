package com.usa.smarttech;

public class Variable_Test {

	String name = "SmartTech"; // Instance variable
	public static String course = "Automation"; // Static variable 
	
	
	public static void main(String[] args) {
		int salary = 1500; // Local variable 
		System.out.println(salary);		
		System.out.println(course);
	}
	
	public void getSalary() { // Non static method 
		System.out.println(course);
		System.out.println(name);
		
	}
	


}
