package whileloop;

public class MaxMin {
	public static void main(String[] args) {
		int n=952347,min=n%10,max=n%10,rem;
		while(n!=0) {
			
			if(min>n%10) {
				min=n%10;
			}
			if(max<n%10) {
				max=n%10;
			}
			
			n=n/10;
		}
		System.out.println("min digit: "+min+"\nmax digit: "+max);
		int i;
		//for(System.out.println("hi"),i=1;i<10;System.out.println(i),i++);
	      
	}

}
