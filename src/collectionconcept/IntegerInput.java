package collectionconcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class IntegerInput {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		for(int i=0;i<len;i++) {
			int n=s.nextInt();//here compiler automatically change primitive to non primitive
			al.add(n);//to add element
		}System.out.println(al);
		Collections.sort(al);//to sort the list
		System.out.println(al);
		System.out.println(al.contains(54));//to check an element is exist or not
		for(int i:al) {
			System.out.print(i+" ");
		}
		System.out.println(al.isEmpty());//to check whether list is empty or not
		al.clear();//clear method to clear all elements
		if(al.isEmpty()) {
			al.add(1);
			System.out.println(al);
		}
		else {
			System.out.println("list is not empty");
		}
	}

}
