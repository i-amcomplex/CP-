import java.io.*;
import java.util.*;
public class OutOfMemoryError {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int m = Integer.parseInt(in.nextToken());
            int h = Integer.parseInt(in.nextToken());
            long[] a = new long[n];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            long[] temp = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
                temp[j]=a[j];
            }
            int[] b = new int[m];
            long[] c = new long[m];
            for (int j = 0; j < m; j++) {
                StringTokenizer in3 = new StringTokenizer(br.readLine());
                b[j] = Integer.parseInt(in3.nextToken());
                c[j] = Long.parseLong(in3.nextToken());
            }
            for (int j = 0; j < m; j++) {
                if(a[b[j]-1]+c[j]>h)
                {
                    a=temp;
                }
                else
                {
                    a[b[j]-1]+=c[j];
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
