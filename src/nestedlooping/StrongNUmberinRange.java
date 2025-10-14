package nestedlooping;

public class StrongNUmberinRange {
	public static void main(String[] args) {
		for(int n=1;n<=10000;n++) {
			int rem=0,sum=0,org=n;
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
				System.out.println(org);
			}
			n=org;
			
		}
	}

}
