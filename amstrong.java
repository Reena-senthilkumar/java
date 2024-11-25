import java.util.*;
public class amstrong {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int sum=0;
	    int n=sc.nextInt();   //153
	    int a=n;
	    for(int i=n;i>0;i++){
	        int r=n%10;   //153%10=3  15%10=5 1%10=1
	        sum=sum+(r*r*r);  //0+27=27  125+27=152  152+1=153
	        		System.out.println(sum);

	        n=n/10; //153/10=15  15/10=1  1/10=0 the while i>0
	    }
	    if(sum==a){
	    
		System.out.println("amstrong number");
	    }
	    else{
	        System.out.println("not amstrong  um");
	    }
	}
}



    

