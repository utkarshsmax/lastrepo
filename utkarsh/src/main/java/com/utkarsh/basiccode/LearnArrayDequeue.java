package com.utkarsh.basiccode;

import java.util.ArrayDeque;

public class LearnArrayDequeue {

	public static void main(String[] args) {


		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.offer(23);
		adq.offer(89);
		adq.offer(21);
		adq.offerFirst(78);
		adq.offerLast(100);
		System.out.println(adq);
		
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		adq.poll();
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);

	}

}
