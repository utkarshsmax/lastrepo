package com.utkarsh.basiccode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInJava {

	public static void main(String[] args) {
		
		Map<String,Integer> mp=new HashMap<>();
		mp.put("One", 1);
		mp.put("Two", 2);
		
		mp.put("Four", 4);
		/*
		 * if(!mp.containsKey("Three")) { mp.put("Three",3); }
		 */
		
		mp.putIfAbsent("Three", 3);
		System.out.println(mp.get("Three"));
		
		System.out.println(mp);
		
		for(Map.Entry<String,Integer> e: mp.entrySet())
		{
			
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		for(String key:mp.keySet())
		{
			System.out.println(key);
		}
		for(Integer i:mp.values())
		{
			System.out.println(i);
		}
		

	}

}
