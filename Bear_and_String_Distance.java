import java.util.*;
import java.io.*;

public class Bear_and_String_Distance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(in.nextToken());
        long k = Long.parseLong(in.nextToken());
        String input = br.readLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            char ch = input.charAt(i);
            if(k!=0){
            if('z'-ch>ch-'a')
            {
                int val = (int)('z'-ch);
                ans.append((char) (ch+Math.min(val,k)));
                k=k-Math.min(val,k);
            }
            else if(ch-'a'>='z'-ch)
            {
                int val = (int)(ch-'a');
                ans.append((char) (ch-Math.min(val,k)));
                k=k-Math.min(val,k);
            }}
            else
            {
                ans.append(ch);
            }
        }
        if(k!=0)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}
