package com.java.practice;

public class ClassAndObjectExample {
	
	protected String name;
	int age;
	static String profession;
	
	public ClassAndObjectExample(){
		System.out.println("No argument construct");
	}
	
	ClassAndObjectExample(String nameValue,int ageValue){
		System.out.println("argument constructor");
		name = nameValue;
		age =ageValue;
	}
	
	public void addition(int a, int b) {
		int c =a +b;
		System.out.println(a+b);
	}
	
	public double addition(double a, int b) {
		double c =a +b;
		System.out.println(a+b);
		return c;
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	protected void display() {
		
		System.out.println("display");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObjectExample classAndObjectExample = new ClassAndObjectExample();
		ClassAndObjectExample classAndObjectExample1 = new ClassAndObjectExample();
		ClassAndObjectExample classAndObjectExample2 = new ClassAndObjectExample("gfgfhs", 78);
		
		classAndObjectExample.name="Rahul";
		classAndObjectExample.age= 20;
		
		classAndObjectExample1.name="Sree";
		classAndObjectExample1.age= 23;
		
		System.out.println(classAndObjectExample.name);
		System.out.println(classAndObjectExample.age);
		
		System.out.println(classAndObjectExample1.name);
		System.out.println(classAndObjectExample1.age);
		
		classAndObjectExample.profession ="IT";
		System.out.println(classAndObjectExample1.profession);
		
		classAndObjectExample.addition(20, 30);
		classAndObjectExample.display();
		
		classAndObjectExample.addition(4, 60,80);
		
	String result =	20>10 ? "Passed" : "Failed" ;
	
	System.out.println(result);
	
	char grade = 'C';
    switch(grade) {
       case 'A' :
          System.out.println("Excellent!"); 
          break;
       case 'B' :
       case 'C' :
          System.out.println("Well done");
          break;
       case 'D' :
          System.out.println("You passed");
       case 'F' :
          System.out.println("Better try again");
          break;
       default :
          System.out.println("Invalid grade");
    }

    
    for(int x = 1; x < 10; x ++) {
        if(x == 5){
        	continue; }
        System.out.println("value of x : " + x );
    }
    
    System.out.println(classAndObjectExample2.name);
	System.out.println(classAndObjectExample2.age);
	
	classAndObjectExample.addition(10, 30, 40);

		
	}

}
