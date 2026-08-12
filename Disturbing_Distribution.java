import java.io.*;
import java.util.*;
public class Disturbing_Distribution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] a= new int[n];
            long cost = 0;
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in.nextToken());
            }

            // 1 2 3 4 5 6 7
            // 7+12+15+4=31+7=38
            // 6+20+4

            // 1 1 2 2 3
            // 3+2+2=7

            // 1 2 3
            // 3+2=
        }
    }
}
