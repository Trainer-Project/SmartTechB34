package com.usa.smarttech;

public class Variables { // This is class
	// Inside the class
	static int employeeSalry; // Global/Class/Static variable

	String employeeName; // Instance variable
	// Before the method

	public static void main(String[] args) { // This is a method
		// Inside the method
		int bonus = 2000; // Local variable
		System.out.println(employeeSalry);
		System.out.println(bonus);

	}

	// This is void method
	void getEmployee() {
		System.out.println();
	}

	// This is a return method
	int getSalary() {
		return 0;

	}

}
