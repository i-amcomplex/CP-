import java.util.*;
import java.io.*;

public class Destroying_towers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] a= new int[n];
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in.nextToken());
            }
            int sum=a[0],min=a[0];
            for (int j = 1; j < n; j++) {
                min=Math.min(min,a[j]);
                sum+=min;
            }
            System.out.println(sum);
        }
    }
}
