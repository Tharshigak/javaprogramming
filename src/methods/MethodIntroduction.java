package methods;
import java.util.Scanner;
public class MethodIntroduction {
	//method declaration or definition part
	//without return & parameter
	void add() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();              
		int b=s.nextInt();
		System.out.println(a+" + "+b+" = "+a+b);
		
	}
	//with return without parameter
	int  sub() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();              
		int b=s.nextInt();
	//	System.out.println(a+" + "+b+" = "+(a-b));
		//   class obj  method
		return a-b;
	}
	//without return with parameter
	void mul(int a,int b) {
		Scanner s=new Scanner(System.in);
		//int a=s.nextInt();              
		//int b=s.nextInt();
		System.out.println(a*b);
		
	}
	//with return with parameter
	int div(int a,int b) {
		Scanner s=new Scanner(System.in);
		//int a=s.nextInt();              
		//int b=s.nextInt();
		if(a!=0&&b!=0) {
			return a/b;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		MethodIntroduction mi=new MethodIntroduction();
		System.out.println("method calling");
		mi.add();//method calling part
		System.out.println("method returned");
		System.out.println("method calling");
		int out=mi.sub();
		System.out.println(out);
		System.out.println("method returned");
		System.out.println("method calling");
		mi.mul(5,5);
		System.out.println("method returned");
		System.out.println("method calling");
		mi.div(25,5);
		System.out.println("method returned");
	}

}
