package com.codegnan.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*  Queue<Integer> pq=new PriorityQueue<>( new MyComparator());
      pq.add(5);
      pq.add(3);
      pq.add(1);
      pq.add(4);
      pq.add(2);
      pq.add(6);
      System.out.println(pq);*/
		Deque<Integer>dq=new ArrayDeque<>();
		dq.add(10);
		dq.offerFirst(10);
		dq.addFirst(20);
	
		
		System.out.println(dq);
		System.out.println(dq.offerFirst(40));
	dq.addFirst(30);
	System.out.println(dq);
		
	}

}
