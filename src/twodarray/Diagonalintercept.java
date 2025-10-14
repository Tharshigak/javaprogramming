package twodarray;

public class Diagonalintercept {
	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j||i+j==a.length-1) {
					System.out.print(a[i][j]+" ");
				}
				
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}

}
