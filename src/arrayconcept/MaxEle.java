package arrayconcept;

public class MaxEle {

	public static void main(String[] args) {
		int a[]= {160,40,32,220,55};
		String str[]= {"str1","str2","str3"};
		int temp=a[0];
		a[0]=a[2];
		a[2]=temp;
		for(int m:a) {
			System.out.println(m);
		}
		for(String s:str) {
			System.out.println(s);
		}
		int num=1;
		do {
		
			System.out.println(num);
			num++;
		}while(num<=10);//atleast once the loop get executed

	}

}
