import java.io.*;
import java.util.*;
public class OIE_exursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in1.nextToken());
            long m = Long.parseLong(in1.nextToken());
            long[] a = new long[n];
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in2.nextToken());
            }

            // check consecutive
            int consec = 1,max=0;
            long temp = a[0];
            for (int j = 1; j < n ; j++) {
                if(a[j]==temp)
                {
                    consec++;
                }
                else
                {
                    temp=a[j];
                    consec=1;
                }
                max = Math.max(consec,max);
            }
            if(max>=m)
            {
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
    }
}
