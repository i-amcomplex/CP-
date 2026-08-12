import java.io.*;
import java.util.*;
public class Beautiful_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String x = br.readLine();
            if(x.length()==1||x.equals("10"))
                System.out.println("0");
            else
            {
                // now convert to charArray
                char[] ch = x.substring(1).toCharArray();
                Arrays.sort(ch);
                // now check if sum is less than 10 if it is greater than 10 then count the number of extra digits
                int count=0,sum=0;
                for (int j = 0; j <ch.length ; j++) {
                    if(sum+(ch[j]-'0')>=10-(x.charAt(0)-'0'))
                    {
                        count++;
                    }
                    else
                    {
                        sum+=ch[j]-'0';
                    }
                }

                // now check when the first character is 1
                if(x.charAt(0)!='1')
                {
                    int count1=1,sum1=0;
                    for (int j = 0; j <ch.length ; j++) {
                        if(sum1+(ch[j]-'0')>=10-1)
                        {
                            count1++;
                        }
                        else
                        {
                            sum1+=ch[j]-'0';
                        }
                    }
                    System.out.println((int)(Math.min(count1,count)));
                }
                else
                {
                    System.out.println(count);
                }
            }
        }
    }
}
