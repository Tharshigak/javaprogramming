package stringconcept;

public class StringBasics {

	public static void main(String[] args) {
		String s="Tharshiga";
		String st=new String("Tharshiga");
		String s1="Tharshiga";
		String st1=new String("Tharshiga");
		String str=new String(new char[] {'t','h','a','r','s','h','i','g','a'});
		char ch[]=new char[] {'T','h','a','r','s','h','i','g','a'};
		System.out.println(s==st);
		
		System.out.println(s==s1);
		
		System.out.println(st==st1);
		System.out.println(s.equals(st1));
		
		System.out.println(s.equals(st1));
		
		System.out.println(st.equalsIgnoreCase(str));
		System.out.println(ch);
		System.out.println(st.equals(ch));
		
		
		
	}

}
