import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s="reena";
	    s=s.replaceAll("\\s","");
	    int size=0;
	    for(char ch:s.toCharArray()){
	        int temp=ch-'a';
	        if(temp>size){
	            size=temp;
	        }
	    }
	    int[] frequency=new int[size+1];
	    for(char ch:s.toCharArray()){
	        frequency[ch-'a']++;
	    }
		for(int i=0;i<frequency.length;i++){
		    if(frequency[i]!=0){
		    System.out.print((char)(i+'a') + "="+ frequency[i]+" ");
		    }
		}
	}
}
