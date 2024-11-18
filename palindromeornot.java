public class palindromeornot
{
	public static void main(String[] args) {
	    String S="racecar";
	    String sc=new StringBuilder(S).reverse().toString();
		System.out.println(S.equals(sc));
	}
} 
