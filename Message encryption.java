import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        String[] arr = new String[s.length() / n];
        int index = 0;
        for (int i = n; i <= s.length(); i += n) { 
            if (index % 2 == 0) {
                arr[index++] = s.substring(i - n, i);
            } else {
                arr[index++] = new StringBuilder( s.substring(i - n, i)).reverse().toString(); 
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                result.append(arr[j].charAt(i));
            }
        }
        System.out.print(result.toString());
    }
}
