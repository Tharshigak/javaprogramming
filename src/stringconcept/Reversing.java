package stringconcept;

public class Reversing {
	public String rev(String s) {
		String a[]=s.split(" ");
		String ret="";
		for(String st:a) {
			ret=ret+revword(st)+" ";
		}return ret.trim();		
	}
	String revword(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		Reversing r=new Reversing();
		System.out.println(r.rev("velalar college"));
	}
}

