import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Strange_partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long x =sc.nextLong();
            long[] a = new long[n];
            long max=0,min=0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLong();
            }
            long sum2=0;
            for (int j = 0; j < n; j++) {
                min+=a[j];
                if(a[j]%x!=0)
                {
                    max+=(long)(a[j]/x)+1;
                }
                else
                {
                    max+=(long)(a[j]/x);
                }
            }
            if(min%x==0)
                System.out.println((long) (min/x)+" "+max);
            else
                System.out.println(((long) (min/x)+1)+" "+max);
        }
        ArrayList<Integer> a1 = new ArrayList<>(10);
        Collections.sort(a1);


    }
}
