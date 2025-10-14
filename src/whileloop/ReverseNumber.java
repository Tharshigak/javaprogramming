package whileloop;

public class ReverseNumber {
	public static void main(String[] args) {
		/*int num=569874,sum=0;
		while(num!=0) {
			int last=num%10;
			sum=sum*10       +last;
			num=num/10;
		}
		System.out.println(sum);*/
		String str="hello";
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}

}
