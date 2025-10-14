package basicsjava;
public class Variables {
	int insVar=25;//instance var
	
	void meth() {
		int locVar=50;//local var
		System.out.println(locVar);
		System.out.println(insVar);
		
		
	}
	void disp() {
		//System.out.println(locVar);
		System.out.println(insVar);
		
	}
	public static void main(String[] args) {
		
		Variables v=new Variables();//object creation
		System.out.println(v);
		Variables v1=new Variables();
		System.out.println(v1);
		v.meth();
		v.disp();

		v.disp();
		

	}

}
