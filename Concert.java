import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Concert {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(in1.nextToken());
        int m = Integer.parseInt(in1.nextToken());
        long[] h = new long[n];
        StringTokenizer in2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h[i]=Long.parseLong(in2.nextToken());
        }
        boolean ans[] = new boolean[m];
        Arrays.fill(ans,true);
        long[] t = new long[m];
        StringTokenizer in3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            t[i]=Long.parseLong(in3.nextToken());
        }
        long count=-1;
        Arrays.sort(h);
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {

            }
        }

    }
}
