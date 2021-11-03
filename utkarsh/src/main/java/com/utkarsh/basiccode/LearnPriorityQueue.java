package com.utkarsh.basiccode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(71);
		pq.offer(78);
		pq.offer(43);
		pq.offer(90);
		pq.offer(6);
		pq.offer(32);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
