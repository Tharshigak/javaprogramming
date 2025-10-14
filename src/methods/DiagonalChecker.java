package methods;
import java.util.Scanner;
public class DiagonalChecker {
	boolean diagonalCheck(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i==j&&arr[i][j]!=1)||(i!=j&&arr[i][j]!=0)){
					return false;
				}
			}
		}return true;
	}
	
	
	DiagonalChecker dia() {
		DiagonalChecker d=new DiagonalChecker();
		Scanner s=new Scanner(System.in);
		return d;
	}
	
	public static void main(String[] args) {
		DiagonalChecker dc=new DiagonalChecker();
		System.out.println(dc.dia());
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		
		System.out.print(dc.diagonalCheck(a)?"Diagonal matrix":"Not a Diagonal matrix");
	}

}
