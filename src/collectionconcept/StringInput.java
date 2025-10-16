package collectionconcept;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StringInput {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			String a=s.nextLine();
			al.add(a);
		}System.out.println(al);
		al.add(3,"cse");
		al.set(0, "ece");//to replace specific element in a specific index
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
