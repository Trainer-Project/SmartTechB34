package com.usa.smarttech;

public class Method_Types {

	//This is a void method.
	public void getEmployee(){
		System.out.println("Hasan");
	}
	//This is a return method.
	public static int getSalary(){
		return 10000;	
	}
	//This is parameterized method.
	public void getEmployeeInfo(int salary,int bonus ){
		System.out.println(salary+bonus);
	}
	public static void main(String[] args) {
		
		System.out.println(Method_Types.getSalary());
		
		Method_Types obj = new Method_Types();
		obj.getEmployee();
		
		obj.getEmployeeInfo(11500, 4200);
	}
}
