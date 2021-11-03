package com.utkarsh.basiccode;

import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Utkarsh");
		s.push("Vishwajeet");
		s.push("Anuradha");
		s.push("Apporav");
		s.push("Aniket");
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);

	}

}
