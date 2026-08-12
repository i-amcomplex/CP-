import java.util.Arrays;
import java.util.Scanner;

public class odd_queries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n];
            long[] pref = new long[n+1];
            pref[0]=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
                pref[j+1]=pref[j]+a[j];
            }
            for (int j = 0; j < q; j++) {
                int l =sc.nextInt();
                int r =sc.nextInt();
                long k = sc.nextLong();
                long ans = pref[l-1]+((r-l+1)*k)+pref[n]-pref[r];

                if(ans%2==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
