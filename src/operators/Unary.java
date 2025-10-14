package operators;

public class Unary {
	public static void main(String[] args) {
		int num=10;
		System.out.println(num++);
		int num1=10;
		System.out.println(++num1);
		int num2=10;
		System.out.println(num2--);
		int num3=10;
		System.out.println(!(++num3>6||++num3<5&&++num3<5));
		System.out.println(num3);
	}

}
