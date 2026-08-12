import java.util.*;
import java.lang.*;
public class Rakhsh_s_Revival
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int n =sc.nextInt();
            int m =sc.nextInt();
            int k =sc.nextInt();
            String s =sc.next();
            int count=0;
            int consec=0;
            // length k to turn everything to 1
            // m is the minimum amount of consecutive 0 which can be accepted
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j)=='0' && j!=n-1)
                    consec++;
                else if(s.charAt(j)=='1' || j==n-1)
                {
                    // if consec is a perfect multiple then ok if not then add check
                    if(consec<=m)
                    {
                        continue;
                    }
                    // consec>m
                    // for every m terms we have to apply at least once
                    //

                }
            }
            System.out.println(count);
        }
    }
}

// 12 3 2
// 000000000000
// 001100110010
// 000