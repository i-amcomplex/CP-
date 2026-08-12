import java.util.HashMap;
import java.util.Scanner;

public class array_cloning_technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        for (int i = 0; i < t; i++) {
            HashMap<Long,Integer> a1 = new HashMap<>();
            int n =sc.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
                if(a1.containsKey(a[j]))
                {
                    a1.put(a[j],a1.get(a[j])+1);
                }
                else
                {
                    a1.put(a[j],1);
                }
            }
            int max=0;
            for (int j = 0; j < n; j++) {
                if(a1.get(a[j])>max)
                    max=a1.get(a[j]);
            }
            if(n==1 || max==n)
            {
                System.out.println(0);
            }
            else
            {
                int ops=0;
                while(max<n)
                {
                    ops+=1;
                    if(max+max>n)
                        ops+=n-max;
                    else
                        ops+=max;
                    max+=max;

                }
                System.out.println(ops);
            }
        }
    }
}