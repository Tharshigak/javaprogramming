package basicsjava;
import java.util.Scanner;
public class UserInput {
 public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String st=s.next();
	System.out.println("val "+st);
	int num=s.nextInt();
	System.out.println("val "+num);
	char ch=s.next().charAt(0);
	System.out.println("val "+ch);
	float f=s.nextFloat();
	System.out.println("val "+f);
	long l=s.nextLong();
	System.out.println("val "+l);
	byte b=s.nextByte();
	System.out.println("val "+b);
	short sh=s.nextShort();
	System.out.println("val "+sh);
	s.nextLine();
	String str=s.nextLine();
	System.out.println("val "+str);
}
}
