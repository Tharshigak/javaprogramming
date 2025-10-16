package collectionconcept;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		System.out.println(ll);
		System.out.println(ll.get(0));
		ll.set(2,10);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(11));
		System.out.println(ll.isEmpty());
		ll.remove(2);
		ll.addFirst(0);
		ll.addLast(10);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		/*ll.removeAll(ll);
		System.out.println(ll);*/
		ll.add(2,10);
		System.out.println(ll);
		ll.removeLastOccurrence(10);
		System.out.println(ll);
		System.out.println(ll.indexOf(5));
		
		
	}

}
