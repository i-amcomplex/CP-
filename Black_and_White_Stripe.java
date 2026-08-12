import java.io.*;
import java.util.*;
public class Black_and_White_Stripe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int k = Integer.parseInt(in.nextToken());
            String s = br.readLine();
            // calculate sum of each window
            // start from first window

            int sum =0;
            for (int j = 0; j <= k-1; j++) {
                if(s.charAt(j)=='B')
                    sum++;
            }

            // now I have the number of blacks in the first k characters

            int ans = k-sum;

            for (int j = k; j <n ; j++) {
                if(s.charAt(j-k)=='B')
                    sum--;
                if(s.charAt(j)=='B')
                    sum++;
                ans = Math.min(ans,k-sum);
            }
            System.out.println(ans);
        }
    }
}
