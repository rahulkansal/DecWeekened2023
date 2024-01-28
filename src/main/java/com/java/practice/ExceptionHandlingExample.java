package com.java.practice;

public class ExceptionHandlingExample {

	public static void main(String[] args) throws  ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub

		//System.out.println(20/0);
		
		try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[1]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      } finally {
	    	   // The finally block always executes.
	    	 // Driver.quit();
	    	  System.out.println("Finally");
	    	  }


		 //int a[] = new int[2];
         //System.out.println("Access element three :" + a[3]);
		System.out.println("After Exception");
	}

}
