import java.util.*;
import java.util.LinkedList;
public class linkedlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new LinkedList<>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        List<Integer> l2=new LinkedList<>();
        for(int i=0;i<n;i++){
            l2.add(sc.nextInt());
        }
        l1.addAll(l2);
        Collections.sort(l1);
        System.out.println(l1);
    }
    
        }
    