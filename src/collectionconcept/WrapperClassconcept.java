package collectionconcept;

//
public class WrapperClassconcept {
	public static void main(String[] args) {
		//auto boxing(primitive to Non primitive)
		int num=10225;
		Integer nu =Integer.valueOf(num);
		Integer n=num;
		System.out.println(n);
		
		//unboxing
		Integer no=2564;
		int op=no.intValue();
		int o=no;
		System.out.println(o);
		
		//Non primitive to non primitive
		//integer to String
		Integer no1=5648;
		String st1=String.valueOf(no1);
		System.out.println(st1);
		
		//String to Integer
		String st="56485";
		float f=10.65f;
		Float fl =Float.valueOf(num);
		Float res=Float.parseFloat(st);
		System.out.println(res);
	}

}
