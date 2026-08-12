import java.io.*;
import java.util.*;
public class Need_more_arrays {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in.nextToken());
            }
            long count=1,min=a[0];
            for (int j = 0; j < n; j++) {
                if(a[j]-min>1) {
                    count++;
                    min = a[j];
                }
            }
            System.out.println(count);
        }
    }
}
