package methods;

public class ClassReturnType {
	
	ClassReturnType demo() {
		ClassReturnType c=new ClassReturnType();
		System.out.println(c);
		return c;
	}
	ClassReturnType demo1(ClassReturnType t) {
		
		System.out.println(t);
		
		return t;
	}
	public static void main(String[] args) {
		ClassReturnType cr=new ClassReturnType();
		int a=10;
		System.out.println(cr.demo());
		System.out.println(cr);
		System.out.println(cr.demo1(cr));
	}

}
