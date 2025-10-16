package queueconcept;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class PriorityQueueComparision {
	public static void main(String[] args) {

		//Queue<Character> q=new PriorityQueue<>((a,b) -> a-b);//ascending

		//PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);//descending
		Queue<Character> q=new PriorityQueue<>(Comparator.comparingInt((Character x)->x));//ascending
		PriorityQueue<Character> pq=new PriorityQueue<>(Comparator.comparingInt((Character x)->x).reversed());//descending

		q.add('x');

		q.add('1');

		q.offer('c');

		q.add('6');

		q.add('h');

		pq.addAll(q);

		System.out.println(q);

		System.out.println(q.poll());

		System.out.println(q.poll());

		System.out.println(pq);

		System.out.println(pq.poll());

		System.out.println(pq.poll());

	}

}
