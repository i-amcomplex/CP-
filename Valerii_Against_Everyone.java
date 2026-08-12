import java.io.*;
import java.util.*;
public class Valerii_Against_Everyone {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            HashMap<Long,Integer> a = new HashMap<>();
            boolean ans = false;
            for (int j = 0; j < n; j++) {
                long a1 = Long.parseLong(in.nextToken());
                if(a.containsKey(a1))
                {
                    ans=true;
                    break;
                }
                else
                {
                    a.put(a1,1);
                }
            }
            if(ans)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            // i can also check if there are two same numbers then also the answer will be yes
            // if all the numbers are distinct then ans is no

        }
    }
}
