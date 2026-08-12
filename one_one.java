import java.io.*;
import java.util.*;
public class one_one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s= br.readLine();
            StringBuilder ans = new StringBuilder();
            int one_c=0,max=0,counted=0;
            for (int j = 1; j <=n-2 ; j++) {//   1 ...n-2 n-1
                if(j!=0 && j!=n-1 && s.charAt(j-1)=='1' && s.charAt(j+1)=='1')
                {
                    ans.append('1');
                }
                else
                    ans.append(s.charAt(j));
            }
            for (int j = 0; j <n ; j++) {
                if(ans.charAt(j)=='1')
                    one_c++;
            }
            // min = one_c-counted
            System.out.println((one_c-counted)+" "+(one_c));
        }
    }
}
