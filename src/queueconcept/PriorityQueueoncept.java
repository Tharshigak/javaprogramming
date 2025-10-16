package queueconcept;
import java.util.Queue;

import java.util.PriorityQueue;

public class PriorityQueueoncept {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		Queue<Integer> q=new PriorityQueue<>();
		
		pq.add(40);
		pq.add(60);
		pq.add(30);
		pq.add(10);
		pq.offer(103);
		System.out.println(pq);
		q.add(40);
		q.add(60);
		q.add(30);
		q.add(10);
		System.out.println(q);
		System.out.println(pq.poll());
		System.out.println(q.poll());
		System.out.println(pq);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(pq.peek());
		pq.addAll(q);
		System.out.println(pq);
		

	}

}
