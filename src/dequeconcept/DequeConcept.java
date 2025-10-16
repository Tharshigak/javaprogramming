package dequeconcept;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeConcept {
	public static void main(String[] args) {
		Deque<Integer> d=new ArrayDeque<>();
		d.offer(10);
		d.offer(20);
		d.offer(30);
		d.offer(40);
		d.offer(50);
		d.offer(60);
		d.offer(70);
		System.out.println(d);
		d.addFirst(100);
		d.addLast(100);
		System.out.println(d);
	}

}
