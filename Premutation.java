import java.util.Scanner;

public class Premutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[][] a = new int[n][n-1];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n-1; k++) {
                    a[j][k]=sc.nextInt();
                }
            }
            int temp=a[0][0];
            int index=0;
            int freq=0;
            for (int j = 0; j < n; j++) {
                if(a[j][0]!=temp)
                {
                    index=j;
                }
                else
                {
                    freq++;
                }
            }
            if(freq==1)
            {
                System.out.print(a[index][0]+" ");
                for (int j = 0; j < n-1; j++) {
                    System.out.print(a[0][j]+" ");
                }
                System.out.println();
            }
            else
            {
                System.out.print(temp+" ");
                for (int j = 0; j < n-1; j++) {
                    System.out.print(a[index][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
