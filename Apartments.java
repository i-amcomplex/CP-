import java.io.*;
import java.util.*;
public class Apartments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(s.nextToken());
        int m =Integer.parseInt(s.nextToken());
        long k =Long.parseLong(s.nextToken());
        long[] a = new long[n];
        long[] b = new long[m];
        StringTokenizer in = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=Long.parseLong(in.nextToken());
        }
        StringTokenizer im = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i]=Long.parseLong(im.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0,p2=0;
        long count=0;
        while(p2<=m-1 && p1<=n-1 ) {
            if (b[p2] >= a[p1] - k && b[p2] <= a[p1] + k) {
                count++;
                p2++;
                p1++;
            }
            else if(b[p2]<a[p1]-k)
            {
                p2++;
            }
            else
            {
                p1++;
            }
        }
        System.out.println(count);
    }
}
