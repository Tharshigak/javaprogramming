package nestedlooping;

public class Pattern {
	public static void main(String[] args) {
		int num=5;
		/*RIGHT ANGLE
		 * for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}*/
		
		//PYRAMID
		/*for(int i=0;i<num;i++) {
			for(int k=i;k<num;k++) {
				System.out.print(" ");
			}
		
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int n=0;n<i;n++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i=0;i<num;i++) {
			for(int k=i;k>i;k++) {
				System.out.print(" ");
			}
			for(int j=num;j>=i;j++) {
				System.out.print("*");
			}System.out.println("\n");
		}
		
	}

}
