import java.util.*;
public class chocolates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long ans=a[n-1];
        long x = a[n-1];
        for (int i = n-2; i >=0; i--) {
            if(Math.min(x-1,a[i])>=0)
            {
                ans+=Math.min(x-1,a[i]);
                x=Math.min(x-1,a[i]);
            }

        }
        System.out.println(ans);
    }
}
