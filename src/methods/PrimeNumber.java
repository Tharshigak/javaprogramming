package methods;
import java.util.Scanner;
public class PrimeNumber {
	boolean prime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(pn.prime(n)?"prime":"Not prime");
		
	}

}
