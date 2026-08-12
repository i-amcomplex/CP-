import java.io.*;
import java.util.*;
public class Another_Sorting_Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a= new long[n];
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in.nextToken());
            }
            long k = 0;
            boolean ans = true;
            int count = 0;
            // check all the difference needed to make it increasing keep on upadting the k value if k is small
            // also keep on incrementing the count value;
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1])
                {
                    if(k!=0)
                    {
                        k=a[j+1]-a[j];
                    }
                    else
                    {
                        // now check if the current a[j+1]-a[j] value is valid or not
                    }
                    count++;
                }
            }
        }
    }
}
