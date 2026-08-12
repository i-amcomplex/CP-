import java.io.*;
import java.util.*;
public class NumberSpiral {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            long y = Long.parseLong(in.nextToken());
            long x = Long.parseLong(in.nextToken());
            long ans=0;
            if(x>y)
            {
                if(x%2==0)
                {
                    ans=((long) (x-1)*(x-1)+1)+y-1;
                }
                else
                {
                    ans = (long)(x*x)-y+1;
                }
            }
            else
            {
                if(y%2==0)
                {
                    ans=(long)(y*y)-x+1;
                }
                else
                {
                    ans=(long)((y-1)*(y-1))+1+x-1;
                }
            }
            System.out.println(ans);
        }
    }
}
