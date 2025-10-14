package nestedlooping;

public class PrimebwRange {
	public static void main(String[] args) {
		int p=0;
		for(int num=10;num<=20;num++) {
			int count=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					count++;
				}
			}if(count==0) {
				p=num;
			}
		}System.out.println(p);
		
	}

}
