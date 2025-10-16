package collectionconcept;
import java.util.ArrayList;
import java.util.List;
public class ArraylistPrograms {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		List l=new ArrayList();
		int n=40;
		Integer num=n;
		String s=String.valueOf(num);
		System.out.println(Integer.valueOf(n));
		char c='p';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(num.MAX_VALUE);
		float f=10.36f;
		Float fl=f;
		System.out.println(fl);
		//changing int to String
		String s1=String.valueOf(n);
		StringBuffer sb=new StringBuffer();
		sb.append(s1);
		System.out.println(sb.reverse());
		Integer in=Integer.parseInt(s1);
		int op=in.intValue();
		
		
	}

}
