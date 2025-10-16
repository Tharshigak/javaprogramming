package collectionconcept;
import java.util.ArrayList;
public class Basicprogram {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
	    System.out.println(al.size());
	    System.out.println(al.get(3));
	    System.out.println(al.set(3, 10));
	    System.out.println(al.get(3));
	    System.out.println(al.remove(3));
	    System.out.println(al.get(3));
	    System.out.println(al.size());
	    for(int a:al) {
	    	System.out.println(a);
	    }
		

	}

}
