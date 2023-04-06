package com.usa.smarttech;

public class MethodTest {

	
	public static void getEmp() {
		System.out.println(Variable_Test.course);
	}
	
	public int getSalary() {
		int salary = 1500;
    return salary;
		
	}
	
	public void getName(String name) {
		System.out.println(name);
	}
	
	public void getNames(String name) {
		System.out.println(name);
	}

	
	public static void main(String[] args) {
		MethodTest.getEmp();
		MethodTest obj = new MethodTest();
		System.out.println("Alam salary is a : "+obj.getSalary());
		obj.getName("QA Liton vai");
	}
	
	
	
}
