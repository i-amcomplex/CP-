import java.util.*;
import java.io.*;

public class Boss_fight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int sum =0;
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in.nextToken());
            }

        }
    }
}
