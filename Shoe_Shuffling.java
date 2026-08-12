import java.io.*;
import java.util.*;
public class Shoe_Shuffling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringBuilder out= new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Long.parseLong(st.nextToken());
            }
            int[] p = new int[n];
            boolean ans = true;
            int start = 0;
            for (int j = 1; j <= n; j++) {
                if (j == n || a[j] != a[j - 1]) {
                    int end = j - 1;
                    if (end - start + 1 < 2)
                    {
                        ans = false;
                        break;
                    }
                    for (int k = start; k < end; k++)
                        p[k] = k + 2;
                    p[end] = start + 1;
                    start = j;
                }
            }

            if(!ans)
            {
                System.out.println("-1");
            }
            else {
                for (int i = 0; i < n; i++)
                    out.append(p[i]+" ");
                System.out.println(out);
            }
        }
    }
}