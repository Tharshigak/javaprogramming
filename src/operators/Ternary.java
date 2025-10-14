package operators;

public class Ternary {
	public static void main(String[] args) {
		 int mark=5;
		 String res;
		 //System.out.println(res=(mark>49)?"pass":"fail");
		  res=((mark>=0)&&(mark<=100))?((mark>49)?"pass":"fail"):"invalid";
		 System.out.println(res);
		 String res1=((mark>=0)&&(mark<=100))?((mark>49)?"pass":"fail"):(mark<0?"negative mark":"out of limit");
		 System.out.println(res1);
	}

}
