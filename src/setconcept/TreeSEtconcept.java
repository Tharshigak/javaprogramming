package setconcept;

import java.util.TreeSet;
import java.util.Set;

public class TreeSEtconcept {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		s.add(101);
		s.add(102);
		s.add(103);
		s.add(103);
		s.add(104);
		s.add(102);
		s.add(100);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.remove(104));
		System.out.println(s);
		System.out.println(s.contains(12));
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s);
		s.removeAll(s);
		System.out.println(s);
	}

}
