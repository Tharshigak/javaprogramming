package nestedlooping;

public class ArmstrongbwRange {
	public static void main(String[] args) {
		
		for(int n=1;n<=10000;n++) {
			int len = 0,org=n;
			while(n!=0) {
				len++;
				n/=10;
			}
			n=org;
			int rem;
			int res=0;
			while(n!=0){
				rem=n%10;
				int pow=1;
				for(int i=1;i<=len;i++) {
					pow=pow*rem;
				}
				res=res+pow;
				n/=10;
			}
			if(org==res) {
				System.out.println(res);
			}
			n=org;
			
	}
	

}
}
