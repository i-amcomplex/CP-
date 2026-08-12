import java.io.*;
import java.util.*;
public class Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer s1 = new StringTokenizer(br.readLine());
            long n = Long.parseLong(s1.nextToken());
            int d = Integer.parseInt(s1.nextToken());
            StringBuilder ans = new StringBuilder("1");
            if((d%3==0 && d>=3) || n>=3)
                ans.append(" 3");
            if(n==5)
                ans.append(" 5");
            if(d==7 || n>=3)
                ans.append(" 7");
            if (d==9 || (n>=3 && (d%3==0 && d>=3)) || n>=6)
                ans.append(" 9");
            System.out.println(ans);
        }
    }
}
