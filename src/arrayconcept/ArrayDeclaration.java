package arrayconcept;
import java.util.Scanner;
public class ArrayDeclaration {

	public static void main(String[] args) {
		char arr[]= {'A','B','C','D'};
		arr[3]='T';//changing arr ele
		System.out.println(arr[3]);
		for(int i=0;i<arr.length;i++) {//array ele
			System.out.print(arr[i]);
		}System.out.println();
		for(int i=arr.length-1;i>=0;i--) {//array rev ele
			System.out.print(arr[i]);
		}
		System.out.println("\n"+arr);
		System.out.println(arr[arr.length-1]);//printing last ele
		//run time input
		Scanner s=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=s.nextInt();
			System.out.println(n[i]);
		}
		
	}

}
