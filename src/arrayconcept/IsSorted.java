package arrayconcept;

public class IsSorted {
	public static void main(String[] args) {
		int a[]= {1,2,3,44,5};
		/*int count=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<=a[i+1]) {
				count++;
			}
		}
		if(count==a.length-1) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}*/
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				System.out.println("unsorted");
				return;
			}
		}
		System.out.println("sorted");
	}

}
