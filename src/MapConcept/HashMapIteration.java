package MapConcept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMapIteration {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
		h.put('v',1);
		h.put('e',1);
		h.put('l',2);
		h.put('a',2);
		h.put('r',1);
		
		//it loops two time ie, it get key from loop and again it search for the corresponding value of key (time complexity is high)
		for(char ch:h.keySet()) {
			System.out.println(ch+":"+h.get(ch));
		}System.out.println();
		
		//it takes key,value early and can get key and its corresponding value(time complexity is low) 
		for(Map.Entry<Character, Integer> it:h.entrySet()) {
			System.out.println(it.getKey()+":"+it.getValue());
		}
		Iterator<Character> it=h.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
