package forloop;

public class PerfectNumber {
	public static void main(String[] args) {
		int num=10,i=1,count=0;
		/*for(;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
				count=count+i;
			}
		}System.out.println("\nsum "+count);
		if(num==count) {
			System.out.println(num+" perfect number");
		}
		else {
			System.out.println(num+" not a perfect number");
		}*/
		for(;i<=num;i++); 
		{
			System.out.println(i);
		}
	}

}
