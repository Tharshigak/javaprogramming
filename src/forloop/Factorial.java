package forloop;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=1;
		int num=s.nextInt();
		for( ;num>=1;num--) {
			f=f*num;
		}
		System.out.println(f);
	}

}
