import java.util.*;
import java.io.*;

public class What_is_for_dinner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        long n = Long.parseLong(in.nextToken());
        int m = Integer.parseInt(in.nextToken());
        long k = Long.parseLong(in.nextToken());
        long[] min = new long[m];
        for (int i = 0; i < m; i++) {
            min[i]= Long.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            int row_index = Integer.parseInt(in2.nextToken())-1;
            long number = Long.parseLong(in2.nextToken());
            min[row_index]= Math.min(min[row_index],number);
        }
        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans += min[i];
        }
        System.out.println(Math.min(k,ans));
    }
}
