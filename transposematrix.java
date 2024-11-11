import java.util.*;
public class transposematrix {
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int[][] a=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j]=sc.nextInt();
			}
		}	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}	
		System.out.println("Transfose of matrix");
		int[][] b=new int[n][n];
		
			for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			    b[i][j]=0;
			    for(int k=0;k<n;k++){
			        b[i][j]=a[j][i];
			    }
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}	

	}
}

}
