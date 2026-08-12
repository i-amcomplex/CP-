import java.util.*;
import java.io.*;
public class Flipping_Binary_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int one_count = 0 , xer_count = 0 , zero_index=-1;
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='1') {
                    one_count++;
                    ans.append((j+1)+" ");
                }
                else
                {
                    xer_count++;
                    zero_index=j+1;
                }
            }
            if(one_count%2==0)
            {
                if(xer_count==1) {
                    System.out.println(1);
                    System.out.println(zero_index);
                }
                else if(ans.length()==0)
                    System.out.println(0);
                else {
                    System.out.println(ans.length()/2);
                    System.out.println(ans);
                }
            }
            else if(one_count%2==1 && n%2==1)
            {
                System.out.println(-1);
            }
        }
    }
}