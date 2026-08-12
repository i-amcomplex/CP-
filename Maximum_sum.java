import java.io.*;
import java.util.*;
public class Maximum_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in1.nextToken());
            long k = Long.parseLong(in1.nextToken());
            long[] a = new long[n];
            long sum = 0;
            StringTokenizer in2 = new StringTokenizer(br.readLine()) ;
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in2.nextToken());
                sum+=a[j];
            }
            Arrays.sort(a);
            int right=1,left=n-1;
            for (int j = 0; j < k; j++) {
                if(a[right]+a[right-1]>=a[left])
                {
                    sum-=a[left];
                    left--;
                }
                else
                {
                    sum-= (a[right]+a[right-1]);
                    right+=2;
                }
            }
            System.out.println(sum);
        }
    }
}
