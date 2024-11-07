import java.util.*;
public class bit {
    public static void binary(int n)
   {
       int bit=0;
	    while(n!=0)
	    {
	        bit+=n%2;
	         n=n/2;
	        
        }System.out.println(bit);
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        binary(n);
	}
}


