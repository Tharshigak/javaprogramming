package twodarray;

public class MatrixAddition {
	public static void main(String[] args) {
		int a[][]= {{1,8,6},{5,6,4},{8,9,6}};
		int b[][]= {{1,5,3},{1,2,3},{8,5,8}};
		int c[][]=new int[3][];
		c[0]= new int[3];
		c[1]= new int[5];
		c[2]= new int[1];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
		System.out.println("Matrix Addition: ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+b[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
        System.out.println("Matrix Subtraction: ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]-b[i][j]+" ");
			}System.out.println();
		}
		System.out.println("\nMatrix multiplcation: ");
		
	}

}
