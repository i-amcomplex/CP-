import java.util.*;
import java.io.*;
public class Biagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            long[] a = new long[k];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                a[j]=Long.parseLong(in1.nextToken());
            }
            Arrays.sort(a);
            if(a[a.length-1]>=3)
                System.out.println("YES");
            else if (a.length>=2)
            {
                if(a[a.length-1]==2 && a[a.length-2]==2)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}
