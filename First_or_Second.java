import java.io.*;
import java.util.*;
public class First_or_Second {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            ArrayList<Long> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(Long.parseLong(in.nextToken()));
            }
            // cases :
            // + +
            // + -
            //
            // - + + + . . . need to check if consecutive positive ka sum is less than the first one
            // - -
            long count=0,ops=0;
            while(ops<n-1 && a.size()>1)
            {
                if(a.get(0)>=0)
                {
                    if(a.get(1)<0)
                    {
                       count+=-1*a.get(1);
                       a.remove(1);
                    }
                    else
                    {
                        count+=a.get(0);
                        a.remove(0);
                    }
                }
                else
                {
                    if(a.get(1)<=0)
                    {
                        count+=-1*a.get(1);
                        a.remove(1);
                    }
                    // now need to check the consec positive
                    else
                    {

                        long consec=0;
                        for (int j = 1; j < a.size() && a.get(j)>=0; j++) {
                            consec+=a.get(j);
                        }
                        if(consec>Math.abs(a.get(0)))
                        {
                            count+=a.get(0);
                            a.remove(0);
                        }
                        else
                        {
                            count+=-1*a.get(1);
                            a.remove(1);
                        }
                    }
                }
                ops++;
            }
            System.out.println(count);
        }
    }
}
