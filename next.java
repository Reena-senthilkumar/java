public class next
{  
    static int isPalindrome(int N)  
    {  
        int num, k, reverse = 0;  
        num = N;  
        while (N != 0)   
        {  
            k = N % 10;  
            reverse = (reverse * 10) + k;  
            N = N / 10;  
        }  
        if (num == reverse)   
        {  
            return 1;  
        }  
        else   
        {  
           return 0;  
        }  
    }  
    public static void main(String[] args)  
    {  
        int N = 123;  
        while(isPalindrome(N)==0)
        {
            N=N+1;
        }
        System.out.println(N);
    } 
 }

    

