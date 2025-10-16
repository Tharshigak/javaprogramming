package MapConcept;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class MaxOccurence {
	
	static LinkedHashMap<Character,Integer> charFreq(String  s){
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			if(l.containsKey(ch)) {
				
				l.put(ch,l.get(ch)+1 );
			}
			else {
				
				l.put(ch, 1);
			}
		}return l;
	}
	
	static char maxFreq(String s) {
		LinkedHashMap<Character,Integer> op=charFreq(s);
	
		char c='\0';
		int max=0;
		/*for(char ch:s.toCharArray()) {
			if(op.get(ch)>max) {
				
				max=op.get(ch);
				c=ch;
			}
			
		}return c;*/
		
		for(Map.Entry<Character, Integer> it:op.entrySet()) {
           if(it.getValue()>max) {
				
				max=it.getValue();
				c=it.getKey();
				
			}
		}
		return c;
	}
	
	
	
	public static void main(String[] args) {
		String s="vellalar";
		
		System.out.println(maxFreq(s));
		
		

	}

}
