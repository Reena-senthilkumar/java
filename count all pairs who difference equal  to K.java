import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   int[] num=new int[n];
	   for(int i=0;i<n;i++){
	       num[i]=sc.nextInt();
	   }
	   int k=sc.nextInt();
	   int count=0;
	   for(int i=0;i<n;i++){
	       for(int j=i;j<n;j++){
	           if(Math.abs(num[i]-num[j])==k){
	               count++;
	           }
	       }
	   }
	   System.out.print("Count "+count);
	}
}
//Input
// 4
//1 2 2 1
//output
//count 4
