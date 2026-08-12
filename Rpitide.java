import java.util.*;
import java.io.*;

public class Rpitide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(in.nextToken());
            int two = Integer.parseInt(in.nextToken());
            int three = Integer.parseInt(in.nextToken());
            int count =0;

            while(true)
            {
                if(one==two || two==three || three==one)
                    break;
                if(one>two && one>three)
                {
                    if(two>three)
                    {
                        one--;
                        three++;
                    }
                    else
                    {
                        one--;
                        two++;
                    }
                }
                else if(two>three && two>one)
                {
                    if(one>three)
                    {
                        two--;
                        three++;
                    }
                    else
                    {
                        two--;
                        one++;
                    }
                }
                else
                {
                    three--;
                    if(one>two)
                        two++;
                    else
                        one++;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
