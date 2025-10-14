package basicsjava;
public class StaticVariable1 {
	int num=1;
	static int num1=1;
	void disp() {
		num++;
		num1++;
		System.out.println(num+" "+num1);
	}
	public static void main(String[] args) {
		StaticVariable1 sv1=new StaticVariable1();
		StaticVariable1 sv2=new StaticVariable1();
		StaticVariable1 sv3=new StaticVariable1();
		sv1.disp();
		sv2.disp();
		sv3.disp();
	}
}
