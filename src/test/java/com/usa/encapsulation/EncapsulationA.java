package com.usa.encapsulation;

//This is private class.
public class EncapsulationA {
	private String jobTitle = "QA Automation Engineer";
	private int salary = 100000;

	// we are using getter() method
	private String getJobTitle() {
		return jobTitle;
	}

	// we are using getter() method
	private int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		EncapsulationA obj = new EncapsulationA();
		// obj.getSalary();
		// obj.getJobTitle();
		System.out.println(obj.getSalary());
		System.out.println(obj.getJobTitle());

	}

}
