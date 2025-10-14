package basicsjava;

public class Mathematical {
	public static void main(String[] args) {
		System.out.print((int)Math.pow(2,15));
		System.out.println(Math.ceil(2.3));
		System.out.println(Math.floor(2.8));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(2.4));
		System.out.println(Math.sqrt(100));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25));
		System.out.println(Math.max(2,5));
		System.out.println(Math.min(2,5));
		System.out.println(285925/1000);
		int num=78;
		int quo=num/10;
		int rem=num%10;
		int res=rem*10;
		System.out.println(res+quo+" "+quo+" "+rem+" "+res);
		int n=789;
		int rev=0;
		while(n!=0) {
			int rem1=n%10;
			rev=rev*10+rem1;
			n=n/10;
		}
		System.out.println(rev);
	}
}
