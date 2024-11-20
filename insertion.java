public class insertion {
	public static void main(String[] args) {
	    int a[]={2,6,1,90,24,56};
	    for(int i=1;i<a.length;i++){
	        int curr=a[i];
	        int j=i-1;
	    {
	        while(j>=0 && a[j]>curr){
	            a[j+1]=a[j];
	            j--;
	        }
	        a[j+1]=curr;
	    }

	    }for(int i=0;i<a.length;i++){
	    		System.out.println(a[i]);
	    }

	}

}

