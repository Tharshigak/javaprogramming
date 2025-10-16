package collectionconcept;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		if(al.isEmpty()) {
			for(int i=0;i<4;i++) {
				int a=s.nextInt();
				al.add(a);
			}
			System.out.println(al);
		}
		else if((al.size())%2==0) {
			System.out.println("size: "+al.size());
			int n=al.size()*2;
			for(int i=al.size();i<n;i++) {
				int a=s.nextInt();
				al.add(a);
			}
		}
			else{
				System.out.println(al);
			}
			System.out.println(al);
			System.out.println("size: "+al.size());
		
	}
}
