package com.java.practice;

public class ChildAbstract extends SuperAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SuperAbstract superAbstract = new SuperAbstract();
		
		ChildAbstract childAbstract = new ChildAbstract();
		childAbstract.display();
		childAbstract.dispaly1();
		childAbstract.dispaly2();
	}

	@Override
	public void dispaly1() {
		// TODO Auto-generated method stub
		System.out.println("display1");
	}

	@Override
	public void dispaly2() {
		// TODO Auto-generated method stub
		System.out.println("display2");
	}

}
