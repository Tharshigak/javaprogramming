package stringconcept;

public class StringMethods {
	public static void main(String[] args) {
		String s1= "hello hi";
		/*String s2=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3=new String("Hello");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		System.out.println(s1.compareTo(s2));
		String t1= "Hello hi";
		String tt1= "hello hi";
		System.out.println(t1.compareToIgnoreCase(tt1));
		System.out.println(t1.toUpperCase());
		System.out.println(t1.toLowerCase());
		System.out.println(t1.charAt(4));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.lastIndexOf("hi"));
		System.out.println(s1.indexOf("e",3));
		System.out.println(s1.indexOf("e",3,8));
		System.out.println(s1.contains("hi"));
		System.out.println(s1.contains("hie"));
		System.out.println(s1.substring(6,8));
		System.out.println(s1.endsWith("hi"));*/
		System.out.println(s1.repeat(3));
		System.out.println(s1=s1.repeat(2));//it assign new memory location
		System.out.println(s1.replace("hi","welcome"));
		System.out.println(s1.replaceFirst("hi", "welcome"));
		System.out.println(s1.replaceAll("[aeiou]", "*"));
		System.out.println(s1.replaceAll("[aeiou]", ""));
		System.out.println(s1.toCharArray());




		
		//upper to lower and lower to upper
		/*
		 * String str="KavIN's scOREs 100 in JAva";
		 
		String res="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z') {
				c=(char)(c-32);
			}
			else if(c>='A'&&c<='Z') {
				c=(char)(c+32);
			}
			res=res+c;
		}System.out.println(res);*/
		
		
		
	}

}
