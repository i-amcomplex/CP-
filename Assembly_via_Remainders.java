import java.util.*;
import java.io.*;
public class Assembly_via_Remainders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            long[] x= new long[n-1];
            for (int j = 0; j < n-1; j++) {
                x[j]=Long.parseLong(in.nextToken());
            }
            long[] ans = new long[n];
            ans[0]=x[0]+1;
            // if a[j] is 1 i have to make sure that the number is greater than the next one
            // if a[j] is smaller than ans[] then ans[] = a[j];
        }
    }
}