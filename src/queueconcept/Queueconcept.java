package queueconcept;
import java.util.Queue;
import java.util.LinkedList;

public class Queueconcept {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(101);
		q.add(102);
		q.add(103);
		q.add(104);
		q.add(105);
		System.out.println("first: "+q.poll());
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);
		q.clear();
		System.out.println(q);
	}

}
