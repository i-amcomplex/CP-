import java.util.*;
import java.io.*;

public class Dicecombinations {
    static HashMap<Long,Long> a = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(solve(0,n)% 1000000007);
    }
    public static long solve(long sum,long var)
    {
        if(a.containsKey(sum))
            return a.get(sum);
        if(sum>var)
            return 0;
        if(sum==var)
        {
            return 1;
        }

        long ans=0;
        for (int i = 1; i <=6 ; i++) {
            long temp=solve((long) (sum+i),var);
            a.put(sum+i,temp);
            ans+=temp;
        }
        return ans;
    }
}
