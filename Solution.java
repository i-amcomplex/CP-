import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        int t =Integer.parseInt(in1.nextToken());
        for(int i = 0 ;i<t;i++)
        {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n =Integer.parseInt(in.nextToken());
            long[] x = new long[n];
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
            {
                x[j]=Long.parseLong(in2.nextToken());
            }
            int min= 0;
            for(int j=0;j<n;j++)
            {
                if(x[min]>x[j])
                    j=min;
            }
            if(x[min]%2==0)
                System.out.println("second");
            else
                System.out.println("first");
        }
    }
}