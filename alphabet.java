public class alphabet 
{
	public static void main(String[] args) 
    {
	    String S="apple$#5is@39a+*3@fruit";
	    char[] ch=S.toCharArray();
	    for(char ech:ch)
        {
	        if(Character.isLetter(ech))
            {
	            System.out.print(ech);
	           
	        }
        }
	}
}
