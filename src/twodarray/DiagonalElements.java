package twodarray;

public class DiagonalElements {
	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}

}
