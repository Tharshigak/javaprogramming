package basicsjava;

public class TypeCasting {
	
	public static void main(String[] args) {
		int n=10;
		float f=(float)n;//implicit type casting
		System.out.println(f);
		char ch='A';
		int i=(int)ch;
		System.out.println(i);
		int j=(int)'B';
		System.out.println(j);
		float num=ch;
		System.out.println(num);
		int K=(int)' ';
		System.out.println(K);
		
		//explicit
		float fl=22.65f;
		int m=(int)fl;
		System.out.println(m);
		
		char ch1='A';
		char ch2='a';
		System.out.println((char)(ch1+32));
		System.out.println((char)(ch2-32));
		
	}

}
