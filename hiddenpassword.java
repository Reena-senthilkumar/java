import java.util.*;
public class hiddenpassword 
{
	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	    String S=sc.nextLine();
	    String[] sp=S.split("@");
	    String s1=S.substring(S.length()-13,S.length());
	    char[] ca=sp[0].toCharArray();
	   System.out.println((ca[0]+ "*".repeat(ca.length-1)+s1).toString());
	}
}

