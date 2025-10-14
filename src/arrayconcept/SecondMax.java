package arrayconcept;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {10,72,11,63,63,9,12,13,15,50,51};
		 int max=a[0];
		    int secmax=a[0];
	    for(int i=0;i<a.length;i++) {
	    	if(max<a[i]) {
	    		max=a[i];
	    	}
	    	if(a[i]!=max) {
	    		if(a[i]>secmax) {
	    			secmax=a[i];
	    		}
	    	}
	    }
	    /*for(int i=0;i<a.length;i++) {
	    	if(a[i]!=max) {
	    		if(a[i]>secmax) {
	    			secmax=a[i];
	    		}
	    	}
	    }*/
	   /*
	    *  int a[]= {10,34,37,37,1,2};
	    
	    int max=a[0];
	    int secmax=a[0];
	    if(a[0]>a[1]) {
	    	max=a[0];
	    	secmax=a[1];
	    }
	    else {
	    	max=a[1];
	    	secmax=a[0];
	    	
	    }
	    for(int i=2;i<a.length;i++) {
	    	if(a[i]>max) {
	    		max=a[i];
	    		secmax=max;
	    	}else if(a[i]>secmax&&a[i]!=max) {
	    		secmax=a[i];
	    	}
	    }*/
	    System.out.println("First max: "+max);
	    System.out.println("Second max: "+secmax);
	    
	}

}
