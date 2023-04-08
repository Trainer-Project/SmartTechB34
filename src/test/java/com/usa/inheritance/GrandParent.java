package com.usa.inheritance;

public class GrandParent {
	
	public void getGrandParentProperties(){
		System.out.println("GrandParent property -> Land Property");
	}
	
	public static void main(String[] args) {
		GrandParent obj = new GrandParent();
		obj.getGrandParentProperties();
	}

}
