import java.util.*;
import java.io.*;

public class Arena_Of_greed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            long sum = 0,count=0;
            while(n!=0)
            {
                if(count%2==0){
                    if(n%4==0 && n>4)
                    {
                        sum+=1;
                        n=n-1;
                    }
                    else if(n%2==0)
                    {
                        sum+=n/2;
                        n/=2;
                    }
                    else
                    {
                        sum+=1;
                        n=(n-1);
                    }
                }
                else
                {
                    if(n%4==0 && n>4)
                    {
                        n=n-1;
                    }
                    else if(n%2==0)
                    {
                        n/=2;
                    }
                    else
                    {
                        n=(n-1);
                    }
                }
                count++;
            }
            System.out.println(sum);
        }
    }
}
