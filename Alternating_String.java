import java.io.*;
import java.util.*;
public class Alternating_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int consec=0;
            int start=-1,end=-1;
            boolean ans = false;
            String s = br.readLine();
            for (int j = 0; j < s.length()-1; j++) {
                if(s.charAt(j)==s.charAt(j+1) )
                {
                    if(start==-1)
                    {
                        start=j;
                    }
                    else if (end == -1)
                    {
                        end = j;
                    }
                    else
                    {
                        ans = true;
                    }
                }

            }
            if(ans)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
