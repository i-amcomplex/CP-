import java.util.*;
import java.io.*;

public class replacement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String r = br.readLine();
            int pointer = 0;
            int freq_1 =0,freq_0=0;
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='0')
                    freq_0++;
                else
                    freq_1++;
            }
            int flag =0;
            for (int j = 0; j < n-1; j++) {
                if(freq_0!=0 && freq_1!=0)
                {
                    freq_1--;
                    freq_0--;
                    if(r.charAt(j)=='0')
                        freq_0++;
                    else
                        freq_1++;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
