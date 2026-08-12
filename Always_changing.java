import java.util.*;
import java.io.*;

public class Always_changing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int ops = 0;
            int freq_1=0,freq_0=0;
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='0')
                    freq_0++;
                else
                    freq_1++;
            }
            int zero=0,one=0;
            int count =0;
            int flag = 0;
            for (int j = 0; j < n-1; j++) {
                if(s.charAt(j)==s.charAt(j+1)) {
                    count++;
                    if (s.charAt(j) == '0')
                        zero++;
                    else
                        one++;
                }
                else
                {
                    flag++;
                }
            }
            if(zero-one>freq_1+1 || one-zero>freq_0+1)
            {
                System.out.println("-1");
                continue;
            }
            if(count==0)
            {
                System.out.println(0);
                continue;
            }
            if(zero==one)
            {
                System.out.println(zero+one);
            }
            else if(zero>one)
            {

            }
        }
    }
}
