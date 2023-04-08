package com.usa.polymorphism;
//polymorphism can be implemented in 2 ways

public class MethodOverloading {

	public void getName(String name) {
		System.out.println(name);

	}

	public void getName(String name, int salary) {
		System.out.println(name + salary);

	}

	public void getName(int bonus) {
		System.out.println(bonus);

	}

	public void getMoney(double dollar) {
		System.out.println(dollar);

	}
	
		public void getHouny(double dollar, int salary) {
		System.out.println(dollar);

		}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getMoney(100000);
		obj.getName("Anamika");
		
		
	}

}
