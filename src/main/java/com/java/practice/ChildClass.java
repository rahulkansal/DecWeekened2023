package com.java.practice;

public class ChildClass extends ClassAndObjectExample {
	
	public ChildClass() {
		super();
		System.out.println("child constructor");
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void addition(int a, int b) {
		
		System.out.println(a+b+b+a);
	}
	
	public void visible() {
		super.addition(10, 30, 40);
		super.name = "Rahul";
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObjectExample classAndObjectExample = new ClassAndObjectExample();
		classAndObjectExample.display();
		
		ChildClass childClass = new ChildClass();
		childClass.multiply(20, 40);
		childClass.display();
		childClass.addition(20, 30);
		childClass.visible();
		
	}

}
