package whileloop;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145,rem,sum=0,org=n;
		while(n!=0) {
			int fact=1;
			rem=n%10;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==org) {
			System.out.println(org+" is strong number");
		}
		else {
			System.out.println(org+" is not a strong number");
		}
	}

}
