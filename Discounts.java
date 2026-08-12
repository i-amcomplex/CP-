import java.io.*;
import java.util.*;
public class Discounts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int k = Integer.parseInt(in.nextToken());
            long[] a =new long[n];
            int[] b = new int[k];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]= Long.parseLong(in1.nextToken());
            }
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                b[j]=Integer.parseInt(in2.nextToken());
            }
            Arrays.sort(a);
            Arrays.sort(b);
            // now check
            int index= n-1;
            // for every
            long cost=0;
            int count=0;
            for (int j = 0; j < k && index>=0; j++) {
                // pay for every b[j] -1 elemtns
                // add till index - b[j]-1 elements
                // add elements till index - b[j]+ 1
                for (int l = index; l> index - b[j] +1 && l>=0 ; l--) {
                    cost+=a[l];
                    count++;
                }
                index = index - b[j];
            }
            if(count+k<=n)
            {
                for (int j = index; j >=0 ; j--) {
                    cost+=a[j];
                }
            }
            System.out.println(cost);
        }
    }
}
