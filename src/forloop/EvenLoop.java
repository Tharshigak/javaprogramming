package forloop;

public class EvenLoop {
	public static void main(String[] args) {
		int i=1;
		/*for(;(i<=10);i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		
		if(i%2!=0) {
			i++;
		}
		for(;(i<=10);i+=2) {
			
				System.out.println(i);
			
		}
		//best it only loops 5 times
	}

}
