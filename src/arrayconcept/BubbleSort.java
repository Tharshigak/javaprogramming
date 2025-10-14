package arrayconcept;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {1,52,69,25,63,14,77,95,103};
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}System.out.println(Arrays.toString(a));
			
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}