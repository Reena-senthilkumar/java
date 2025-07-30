import java.util.List;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    int num=10;
	    List<Integer> list=new LinkedList<>();
	    while(num!=0){
	        list.add(num%2);
	        num=num/2;
	    }
	    for(int i=list.size()-1;i>=0;i--){
		System.out.print(list.get(i)+" ");
	    }
	}
}
