package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mark[]=new int[6];
		int tot=0;
		String sub[]= {"tamil","eng","mat","phy","chem","bio"};
		/*for(int i=0;i<mark.length;i++) {
			System.out.print(sub[i]+" ");
			mark[i]=s.nextInt();
			tot=tot+mark[i];
			
			}*/
		float avg=(tot/mark.length);
		System.out.println("total: "+tot);
		System.out.println("Average: "+avg);
		System.out.println(Arrays.toString(sub));

	}

}
