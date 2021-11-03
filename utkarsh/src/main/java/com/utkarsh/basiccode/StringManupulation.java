package com.utkarsh.basiccode;

import java.util.Scanner;

public class StringManupulation {

	public static void main(String[] args) {
		System.out.println("Enter String=");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char ch1[]=new char[str.length()];
		String temp=" ";
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			
			if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			{
				ch1[i]=str.charAt(i);
			}
			else
			{
				break;
			}
		}
		temp=str.valueOf(ch1);
		String temp2=reverse(temp);
		if(temp2.equals(str))
		{
			System.out.println("");
		}
		else
		{
			System.out.println("you inputed a weak string");
		}

	}

	private static String reverse(String temp) {

		char ch1[]=new char[temp.length()];
		String temp1=" ";
		int c=0;

		for(int i=temp.length()-1;i>=0;i--)
		{
			ch1[c]=temp.charAt(i);
			c++;
		}
		temp1=temp.valueOf(ch1);
		
		return temp1;
		
	}

}
