import java.io.*;
import java.util.*;
public class Euclid_Sequence_and_Two_Numbers  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a= new long[n];
            StringTokenizer s1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(s1.nextToken());
            }
            Arrays.sort(a);
            boolean ans = true;
            for (int j = n-1; j>=2; j--) {
                if(a[j-2]!=(a[j]%a[j-1]))
                {
                    ans=false;
                    break;
                }
            }
            if (ans)
            {
                System.out.println(a[n-1]+" "+a[n-2]);
            }
            else
                System.out.println("-1");
        }
    }
}
