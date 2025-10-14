package stringconcept;

public class StringReverse {
	public static void main(String[] args) {
		String str="KavIN's scOREs 100 in JAva";
		String res="";
		/*
		 * for(int i=str.length()-1;i>=0;i--) {
		 
			char c=str.charAt(i);
			res=res+c;
		}System.out.println(res);*/
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!=32) {                
				//System.out.println(c);
			}
			
			
		}System.out.println(str.lastIndexOf("a"));
	System.out.println(str.indexOf("a",10));
	}

}
