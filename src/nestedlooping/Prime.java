package nestedlooping;

public class Prime {

	public static void main(String[] args) {
		int num=5/*,count=0*/,i=2;
		boolean flag=true;
		for(;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				//count++
			}
		}
		if(flag/*count==0*/) {
			System.out.println(num);
		}
		/*USING IF
		 * if(i<=num/2) {
		 
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num);
		}*/

	}

}
