import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class cherry_bomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            long k = Long.parseLong(in.nextToken());
            long[] a = new long[n];
            long[] b = new long[n];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
            }
            for (int j = 0; j < n; j++) {
                b[j]=Long.parseLong(in2.nextToken());
            }
            // now check if confirmed sum hai ke nai
        }
    }
}
