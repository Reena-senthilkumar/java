import java.util.*;
public class mindisbwtwowords {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String[] s="the quick the brown quick brown the frog".split(" ");
String sou="quick";
String des="frog";
int a=0,b=0;
int ma=Integer.MIN_VALUE;
int mb=Integer.MIN_VALUE;
for(int i=0;i<s.length;i++){
if(s[i].equals(sou)){
a=i+1;
ma=Math.max(a,ma);
} else if(s[i].equals(des)){
b=i+1;
mb=Math.max(b,mb);
}}
System.out.print(Math.abs(ma-mb));
}
}
