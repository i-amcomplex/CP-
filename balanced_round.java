import java.util.Arrays;
import java.util.Scanner;

public class balanced_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            Arrays.sort(a);
            int consec=0,c=1;
            for (int j = 1; j < n; j++) {
                if(a[j]-a[j-1]<=k)
                    c++;
                else
                {
                    c=1;
                    consec=Math.max(c,consec);
                }
            }
            consec=Math.max(c,consec);
            System.out.println(n-consec);
        }
    }
}
