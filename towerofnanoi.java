public class towerofnanoi {
        public static void main(String[] args) {
           towerofhanoi(3,'A','B','C');
        }
        public static void towerofhanoi(int n,char src,char aux,char des){
            if(n==1){
                System.out.println("Move disk "+n+" from "+src+" to "+des);
            }else{
                towerofhanoi(n-1,src,des,aux);
                  System.out.println("Move disk "+n+" from "+src+" to "+des);
                  towerofhanoi(n-1,aux,src,des);
            }
        }
    }
    
