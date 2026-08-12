import java.io.*;
import java.util.*;
public class Ferris {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in1= new StringTokenizer(br.readLine());
        int n =Integer.parseInt(in1.nextToken());
        long x =Long.parseLong(in1.nextToken());
        long[] p = new long[n];
        StringTokenizer in2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i]=Long.parseLong(in2.nextToken());
        }
        // total weight should not exceed x
        Arrays.sort(p);
        long count=0;
        int end=n-1,start=0;
        while(end>=start)
        {
            if(p[start]+p[end]<=x)
            {
                count++;
                start++;
                end--;
            }
            else {
                count++;
                end--;
            }
        }
        System.out.println(count);
    }
}
