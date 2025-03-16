
import java.util.Scanner;

public class AfollowB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        String ab=Character.toString(a)+Character.toString(b);
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.substring(i,i+2).equals(ab)){
                count++;
            }
        }System.err.println(count);

    }
}
