import java.util.*;
class findingindexvalue{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int v=sc.nextInt();
for(int i=0;i<n;i++){
    if(arr[i]==v){
        a=i;
        break;
    }
    else{
        a=-1;
    }
}
System.out.print(a);
}
}
