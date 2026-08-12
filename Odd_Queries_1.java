import java.util.*;
import java.io.*;
public class Odd_Queries_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int q = Integer.parseInt(in.nextToken());
            long[] a = new long[n];
            long sum =0;
            long[] pref = new long[n+1];
            pref[0]=0;
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
                sum+=a[j];
                pref[j+1]=pref[j]+a[j];
            }
            for (int j = 0; j < q; j++) {
                StringTokenizer in2= new StringTokenizer(br.readLine());
                int start = Integer.parseInt(in2.nextToken());
                int end = Integer.parseInt(in2.nextToken());
                long k = Long.parseLong(in2.nextToken());
                if((sum-pref[end]+pref[start-1]+(end-start+1)*k)%2==0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
