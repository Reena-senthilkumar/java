/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class anagram_or_not
{
	public static void main(String[] args) {
	    String a="listen";
	    String b="silent";
	    char[] ch1=a.toCharArray();
	    Arrays.sort(ch1);
	    char[] ch2=b.toCharArray();
	     Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)){
		    System.out.println("Anagram");
		}else{
			System.out.println("not anagram");
		}
	}
}