package MapConcept;
import java.util.LinkedHashMap;
public class CharacterFrequency {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
		String s="velalar";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(l.containsKey(ch[i])) {
				
				l.put(ch[i],l.get(ch[i])+1 );
			}
			else {
				
				l.put(ch[i], 1);
			}
		}System.out.println(l);

	}

}
