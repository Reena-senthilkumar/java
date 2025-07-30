public class Main
{
	public static void main(String[] args) {
	    String s="1010";
	    StringBuilder sb=new StringBuilder(s);
		System.out.print(Integer.parseInt(sb.toString(),2));
	    }
}
