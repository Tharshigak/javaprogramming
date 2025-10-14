package twodarray;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrayBasics {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][]= {
				{1,2,3},{4,5,6},{7,8,9}	
		};
		/*int a[][]=new int[3][3];
		//                r  c
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				//System.out.print(a[i][j]+" ");
				a[i][j]=s.nextInt();
			}System.out.println();
		}
		//System.out.println(a[2].length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				//a[i][j]=s.nextInt();
			}System.out.println();
		}*/
		
		for(int[] arr:a) {
			System.out.println(Arrays.toString(a));
		}
		                 //or
		for(int arr[]:a) {
			for(int n:arr) {
				System.out.print(n+" ");
			}System.out.println();
		}
	}

}
