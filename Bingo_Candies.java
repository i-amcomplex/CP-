import java.util.Scanner;
public class Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[][] a = new int[n][n];
            int[] freq=new int[n*n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    a[j][k]=sc.nextInt();
                    freq[a[j][k]-1]++;
                }
            }
            int flag=0;
            for (int j = 0; j < freq.length; j++) {
                if(freq[j]>n*(n-1))
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
