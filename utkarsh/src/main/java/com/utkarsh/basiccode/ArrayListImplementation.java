package com.utkarsh.basiccode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArrayListImplementation {

	public static void main(String[] args) {


		
		  List<String> ll=new ArrayList<String>(); ll.add("Utkarsh"); ll.add("Vivek");
		  ll.add("Vishwajeet"); ll.add("Apoorv"); ll.add("Abhay");
		  System.out.println(ll); System.out.println(ll.get(2));
		  System.out.println(ll.remove("Abhay")); System.out.println(ll); ll.add(4,
		  "Shubham"); System.out.println(ll); ll.clear(); System.out.println(ll);
		 
		
		
		
		  List<Integer> ll1=new ArrayList<Integer>(); ll1.add(5); ll1.add(60); ll1.add(90);
		  ll1.add(3); ll1.add(7); System.out.println(ll1); Collections.sort(ll1);
		  System.out.println(ll1);
		  
		  System.out.println(ll1.contains(7));
		  
		  for(Integer i:ll1) { System.out.println(" "+i); }
		  
		  Iterator<Integer> it=ll1.iterator(); while(it.hasNext()) {
		  System.out.println(" "+it.next()); }
		 
		
		
		  
		  
		  
		 
		
		
		

	}

}
