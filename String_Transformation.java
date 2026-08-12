import java.util.*;
import java.io.*;

public class String_Transformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ans = br.readLine();
        int count = 0;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < ans.length(); i++) {
            if(count==26)
            {
                a.append(ans.charAt(i));
            }
            else {
            if((int)ans.charAt(i)<='a'+count)
            {
                a.append((char)('a'+count));
                count++;
            }
            else
                a.append(ans.charAt(i));
            }
        }
        if(count==26)
            System.out.println(a);
        else
            System.out.println(-1);
    }
}
