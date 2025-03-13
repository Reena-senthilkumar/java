import java.util.Scanner;
public class ifstringarticlecontains {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        String[] sa=s.split("[//s.,]+");
        for(int i=0;i<sa.length;i++){
            if(sa[i].equalsIgnoreCase("the") || sa[i].equalsIgnoreCase("an") || sa[i].equalsIgnoreCase("the")){
                c+=1;
            }
        }System.out.print(c);
    }
}
