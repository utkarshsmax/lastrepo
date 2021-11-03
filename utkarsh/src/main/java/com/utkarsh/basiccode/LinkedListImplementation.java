package com.utkarsh.basiccode;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListImplementation {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(8);
		queue.offer(71);
		queue.offer(47);
		queue.offer(73);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		//Exception Method of Queue
		Queue<Integer> queue1=new LinkedList<>();
		queue1.add(5);
		queue1.add(98);
		queue1.add(57);
		queue1.add(15);
		
		System.out.println(queue1);
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		
		System.out.println(queue1.element());
		
		
		
		

	}

}
