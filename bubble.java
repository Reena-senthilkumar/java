public class bubble {
	public static void main(String[] args) {
	    int[] a={2,19,45,9,22,50};
	    int x=a.length;
	    for(int i=0;i<x;i++)
	    {
	        for(int j=0;j<x-i-1;j++)
	        {
	            if(a[j]>a[j+1])
	            {
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;

	            }

	        }
	    	System.out.println(a[i]);

	    }


	}
}

