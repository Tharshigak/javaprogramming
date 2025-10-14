package whileloop;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153,len=0,org=n,rem,res=0;
		while(n!=0) {
			len++;
			n/=10;
		}
		n=org;
		while(n!=0) {
			rem=n%10;
			int pow=1;
			for(int i=1;i<=len;i++) {
				pow=pow*rem;
			}
			res=res+pow;
			n/=10;
		}
		if(org==res) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}
	}

}
