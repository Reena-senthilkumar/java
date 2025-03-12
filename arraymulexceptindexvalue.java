public class arraymulexceptindexvalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {  
            int mul=1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {  
                    mul*=arr[j];
                }
                    else{
                        continue;
                    }
                    }System.out.print("Except "+arr[i]+" "+mul+" ,");
                }
            }
        }
