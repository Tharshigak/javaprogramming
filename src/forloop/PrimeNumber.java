package forloop;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=5,i,count=0;
		for( i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
				//System.out.println(i);//factors
			}
		}
		if(count==0) {//prime
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
		/*for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}*/

	}

}
