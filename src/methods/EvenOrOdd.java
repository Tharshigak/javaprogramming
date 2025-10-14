package methods;
import java.util.Scanner;
public class EvenOrOdd {
	boolean evenorodd(int n) {
		if(n%2!=0) {
			return false;
		}return true;
	}
	

	public static void main(String[] args) {
		EvenOrOdd e=new EvenOrOdd();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		
		System.out.println(e.evenorodd(n)?"even":"odd");

	}

}
