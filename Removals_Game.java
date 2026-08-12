import java.io.*;
import java.util.*;
public class Removals_Game {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            boolean ans = true;
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
            }
            int flag = -1;
            for (int j = 0; j < n; j++) {
                long b = Long.parseLong(in2.nextToken());
                if(a[j]==b && flag<=-1) {
                    flag--;
                }
                else if (a[n-1-j]==b && flag>=-1)
                {
                    flag++;
                }
                else
                {
                    ans = false;
                    break;
                }
            }
            if(ans)
            {
                System.out.println("Bob");
            }
            else
                System.out.println("Alice");
        }
    }
}
