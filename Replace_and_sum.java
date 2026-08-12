import java.util.Arrays;
import java.util.Scanner;

public class Replace_and_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long q =sc.nextLong();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j]=sc.nextInt();
            }
            if(a[n-1]<b[n-1])
                a[n-1]=b[n-1];
            for (int j = n-2; j >=0 ; j--) {
                if(a[j+1]>a[j])
                    a[j]=a[j+1];
                if(a[j]<b[j])
                    a[j]=b[j];
            }
            int[] pref= new int[n+1];
            pref[0]=0;
            for (int j = 1; j <= n; j++) {
                pref[j]=pref[j-1]+a[j-1];
            }
            for (int j = 0; j < q; j++) {
                int l =sc.nextInt();
                int r =sc.nextInt();
                int ans=pref[r]-pref[l-1];
                System.out.print((ans)+" ");
            }
            System.out.println();
        }
    }
}
