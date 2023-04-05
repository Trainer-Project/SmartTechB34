package com.usa.smarttech;

public class Method_Types {
	String name;//Instance variable
	int salary;
	static int bonus;//Static/Global variable
	//This is a void method.
	public void getEmployee(){
		salary= 9000;
		name="Fahim";
		System.out.println("Employee name is : " + name);
	}
	//This is a return method.
	public int getSalary(){
		salary = 9500;
		bonus= 1800;
		int total=salary+bonus;
		return total;	
	}
	//This is parameterized method.
	public void getEmployeeInfo(){
		name="Rakib";
		salary= 8500;
		bonus= 1450;
		System.out.println(salary+bonus);
	}
	public void getName() {
		name="Saimon";
	}
	public static void main(String[] args) {
		
		//System.out.println(Method_Types.getSalary());
		
		Method_Types obj = new Method_Types();
		obj.getEmployee();
	}
}
