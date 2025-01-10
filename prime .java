public class prime{
        public static void main(String[] args) {
            int n = 100; // Print prime numbers up to n
    
            System.out.println("Prime numbers between 1 and " + n + " are:");
    
            for (int num = 2; num <= n; num++) {
                boolean isPrime = true;
    
                // Check if num is divisible by any number from 2 to its square root
                for (int i = 2; i <=Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break; // No need to check further
                    }
                }
    
                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }    

