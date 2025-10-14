package twodarray;
//importing another package
//        package     class
import stringconcept.Reversing;
public class CheckDiagonal {
	public static void main(String[] args) {
		//creating object
		Reversing r=new Reversing();
		//accessing method
		System.out.println(r.rev("tharshi ga"));
		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=true;
	for(int i=0;i<a.length;i++) {
    //label		
		a:
			for(int j=0;j<a[i].length;j++) {
				if((i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0)) {
					flag=false;
					break a;
				}
			}
		}
		if(flag)
			System.out.println("Diagonal");
		else {
			System.out.println("Not a Diagonal");
		}
	}

}
