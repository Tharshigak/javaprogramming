package arrayconcept;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {25,99,15,46,78,93};
		int des[]=new int[10];
		/*for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.println(Arrays.toString(a));
		}*/
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int k=2;
		System.out.println(a[a.length-k]);
		//Arrays.fill(a, 103);
		System.out.println(Arrays.toString(a));
		System.arraycopy(a, 2, des, 0, 4);
		System.out.println(Arrays.toString(des));
	}
	

}
