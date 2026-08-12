import java.io.*;
import java.util.*;
//https://codeforces.com/problemset/problem/2171/B
public class Yuu_Koito_and_Minimum_Absolute_Sum {
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
            // so inside the array we shall replace all the -1 to 0
            StringBuilder ans = new StringBuilder();
            for (int j = 1; j < n-1; j++) {
                if(a[j]==-1)
                    ans.append(0+" ");
                else
                    ans.append(a[j]+" ");
            }
            if(a[0]==-1){
                if(a[n-1]==-1)
                {
                    System.out.println("0");
                    System.out.println("0 "+ans+"0");
                }
                else
                {
                    System.out.println("0");
                    System.out.println(a[n-1]+" "+ans+""+a[n-1]);
                }
            }
            else if(a[n-1]==-1)
            {
                // a[0] is not 0
                System.out.println("0");
                System.out.println(a[0]+" "+ans+""+a[0]);
            }
            else {
                System.out.println((long) (Math.abs(a[0] - a[n - 1])));
                System.out.println(a[0]+" "+ans+""+a[n-1]);
            }
        }
    }
}