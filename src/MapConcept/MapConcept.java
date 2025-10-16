package MapConcept;
import java.util.Map;
import java.util.HashMap;
public class MapConcept {
	public static void main(String[] args) {
		//   key     value
		HashMap<Integer,String> m=new HashMap<>();
		//   key value
		m.put(0, "a");
		m.put(1, "b");
		m.put(2, "c");
		m.put(3, "d");
		m.put(4, "e");
		m.put(5, "e");
		m.put(5, "f");
		System.out.println(m);
		System.out.println(m.get(4));
		System.out.println(m.size());
		System.out.println(m.containsKey(9));
		System.out.println(m.containsValue("a"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());

	}
}
