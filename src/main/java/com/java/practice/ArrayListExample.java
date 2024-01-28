package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list=new ArrayList<Object>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi"); 
		list.add(null);
		list.add(null);
		list.add(30);
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		System.out.println(list.get(5));

	}

}
