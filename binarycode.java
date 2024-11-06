import java.util.*;
public class binarycode {
    public static void binary(int n)
   {
    int rem;
	    while(n!=0)
	    {
	        rem=n%2;
	        System.out.print(rem+" ");
	        n=n/2;
        }
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        binary(n);
	}
}

