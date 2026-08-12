import java.util.*;
import java.io.*;

public class deja_vu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int q = Integer.parseInt(in.nextToken());
            long[] a = new long[n];
            int max = -1;
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]= Long.parseLong(in2.nextToken());
            }
            int[] queries = new int[q];
            StringTokenizer in3= new StringTokenizer(br.readLine());
            for (int j = 0; j < q; j++) {
                queries[j]=Integer.parseInt(in3.nextToken());
            }
            for (int j = 0; j < q; j++) {
                if(queries[j]>max )
                {
                    continue;
                }
                else
                {
                    // now my queries [j] is less than max
                    // so i will need to update all of those
                    for (int k = 0; k < n; k++) {
                        if(a[k]%(Math.pow(2,queries[j]))==0)
                            a[k]+=Math.pow(2,queries[j]-1);
                    }
                    max=queries[i];
                }
            }
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < n; j++) {
                ans.append(a[j]+" ");
            }
            System.out.println(ans);
        }
    }
    public static int pow (long n)
    {
        int pow =-1;
        while(n!=0)
        {
            pow++;
            n /= 2;
        }
        return pow;
    }
}
