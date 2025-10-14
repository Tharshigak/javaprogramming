package forloop;

public class SpyNumber {

	public static void main(String[] args) {
		int n=123,rem,sum=0,pro=1;
		for(;n!=0;) {
			rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n/=10;
			
		}
		if(sum==pro) {
			System.out.println(sum+" is spy number");
		}
		else {
			System.out.println(sum+" is not spy number");
		}

	}

}
