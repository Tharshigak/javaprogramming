package whileloop;

public class Palindrome {
	public static void main(String[] args) {
		int num=121,res=num,sum=0;
		while(num!=0) {
			int last=num%10;
			sum=sum*10+last;
			num=num/10;
		}
		if(res==sum) {
			System.out.println(res+" is palindrome");
		}
		else {
			System.out.println(res+" is not palindrome");
		}
	}

}
