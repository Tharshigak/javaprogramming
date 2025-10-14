package forloop;

public class Factors {
	public static void main(String[] args) {
		int num=27,i=1,count=0;
		for(;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
		}System.out.println("\n"+count);
		
	}

}
