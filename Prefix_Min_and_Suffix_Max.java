import java.util.Arrays;
import java.util.Scanner;

public class Prefix_Min_and_Suffix_Max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a= new long[n];
            a[0]=sc.nextLong();
            long min=a[0];
            long[] pref=new long[n-1];
            long[] suf=new long[n-1];
            for (int j = 1; j <n ; j++) {
                a[j]=sc.nextLong();
                if(min>a[j]) {
                    min = a[j];
                }
                pref[j-1]=min;
            }
            long max=a[n-1];
            suf[n-2]=max;
            for (int j = n-2; j >=1; j--) {
                if(max<a[j])
                {
                    max=a[j];
                }
                suf[j-1]=max;
            }
            System.out.print("1");
            for (int j = 1; j <n-1 ; j++) {
                if(a[j] <= pref[j-1] || a[j] >= suf[j-1]) {
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.print("1");
            System.out.println();
        }
    }
}
