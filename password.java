
import java.util.*;

public class password {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    String password=sc.nextLine();
if(password.contain(" ")){
    System.out.println("invalid password");
    return;
}

boolean charl=false;
boolean uc=false;
boolean lc=false;
boolean di=false;
boolean sch=false;
for(int i=0;i<password.length();i++){
    char ch=password.charAt(i);
    if(password.length()>=8 && password.isUpperCase(i) && password.isLowerCase(i) && password.isDigit(i)){
       charl=true;
       uc=true;
       lc=true;
       di=true;
       sch=true; 
    }
}
boolean sp=charl && uc && lc && di && sch
if(sp){
    System.out.println("Strong password");
}
else{
    System.out.println("weak password");
}}
}
