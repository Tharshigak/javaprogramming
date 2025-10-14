package ambiguityexception;

public class Basics {
	void sum() {
		int a=10,b=5;
		System.out.println(a+b);
	}
	/*void sum(int a,int b) {
		
		System.out.println(a+b);
	}*/
    void sum(float a,int b) {
		
		System.out.println(a+b);
	}
    void sum(int a,float b) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Basics b=new Basics();
		b.sum();
		//for line 8 method
		//b.sum(10,5);
//  it checks exact match otherwise it search for implicit match
		b.sum(10f,10);
		//b.sum(1,2);//it is error because it implicitly matches the line no: 12 and 16 method.
		
		
	}

}
