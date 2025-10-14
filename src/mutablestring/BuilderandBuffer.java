package mutablestring;

public class BuilderandBuffer {

	public static void main(String[] args) {
		String s="tharshi";
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(s);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" is a good girl");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		sb.insert(13, "very ");
		System.out.println(sb);
		sb.delete(10, 11);
		int a[]= {1,2,3};
		System.out.println(a.toString());

	}

}
