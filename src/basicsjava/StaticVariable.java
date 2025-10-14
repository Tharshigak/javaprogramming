package basicsjava;

public class StaticVariable {

	String name;

	static String clg;

	void disp() {

		System.out.println(name+" "+clg);

	}

	public static void main(String[] args) {

		StaticVariable  s1=new StaticVariable ();

		StaticVariable  s2=new StaticVariable ();

		s1.name="Kabilan";

		clg="Vcet";

		s2.name="Harish";

		s1.disp();

		s2.disp();

	}
}
