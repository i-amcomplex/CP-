import java.util.*;
import java.io.*;

public class Maximum_Even_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            long a= Long.parseLong(in.nextToken());
            long b = Long.parseLong(in.nextToken());
            if(a%2==1 && b%2==1)
            {
                a = a*b;
                System.out.println(a+1);
            }
            else if(a%2==1 && b%2==0)
            {
                // check the maximum power of 2
                int max  = 0;
                long temp = b;
                while(temp%2==0)
                {
                    max++;
                    temp/=2;
                }
                if(max == 1)
                {
                    System.out.println(-1);
                }
                else
                {
                    // so i will leave everything except a 2
                    a = a*(long) (b/2);
                    System.out.println(a+2);
                }
            }
            else if (a%2==0 && b%2==1)
            {
                System.out.println("-1");
            }
            else if(a%2==0 && b%2==0)
            {
                a = a*(long) (b/2);
                System.out.println(a+2);
            }
        }
    }
}
