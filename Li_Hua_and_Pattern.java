import java.io.*;
import java.util.*;
public class Li_Hua_and_Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            long k = Long.parseLong(in.nextToken());
            int[][] a= new int[n][n];
            for (int j = 0; j < n; j++) {
                StringTokenizer in1 = new StringTokenizer(br.readLine());
                for (int l = 0; l < n; l++) {
                    a[j][l]=Integer.parseInt(in1.nextToken());
                }
            }
            int count=0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if(a[j][l]!=a[n-1-j][n-1-l])
                        count++;
                }
            }
            if((int)(count/2)>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
