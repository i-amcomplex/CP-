import java.util.*;

public class Move_to_the_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a= new long[n];
            a[0]=sc.nextLong();
            // max should store maximum of the left side of the array
            long[] max = new long[n];
            max[0]=a[0];
            long[] pref = new long[n];
            pref[0]=a[0];

            for (int j = 1; j < n; j++) {
                a[j]=sc.nextLong();
                max[j]=Math.max(a[j],max[j-1]);
                pref[j]=pref[j-1]+a[j];
            }
            // now calculate prefix sums
            long[] ans = new long[n];
            for (int j = n-1; j >=0; j--) {
                ans[j]=max[n-1-j]+pref[n-1]-pref[n-j-1];
            }
            for (int j = 0; j < n; j++) {
                System.out.print(ans[j]+" ");
            }
            System.out.println();
        }
    }
}
