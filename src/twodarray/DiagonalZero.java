package twodarray;

public class DiagonalZero {
	public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
      for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				if(i+j==a.length-1) {
					a[i][j]=0;
					
				}
				else if(i==j) {
					a[i][j]=0;
				}
				System.out.print(a[i][j]+" ");
				
			}System.out.println();
		}
	}

}
