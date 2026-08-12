import java.io.*;
import java.util.*;
public class Loyalty {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            long x = Long.parseLong(in.nextToken());
            long[] a= new long[n];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
            }
            Arrays.sort(a);
            long count=0,prev=0,last=0;
            int l=0,r=n-1;
            StringBuilder ans = new StringBuilder();
            while(r>=l)
            {
                if(prev+a[l]<x)
                {
                    prev+=a[l];
                    ans.append(a[l]+" ");
                    l++;
                }
                else if(prev+a[l]>=x)
                {
                    prev+=a[r];
                    count+=a[r];
                    ans.append(a[r]+" ");
                    prev%=x;
                    r--;
                }
            }
            /*
            for (int j = 0; j < n-r_counter;j++) {
                if(prev+a[j]<x)
                {
                    prev+=a[j];
                    ans.append(a[j]+" ");

                }
                /*
                else if (prev+a[j]>=x)
                {
                    prev+=a[j];
                    prev= prev%x;
                    count+=a[j];
                    System.out.print(a[j]+".");
                    ans.append(a[j]+" ");
                }
                */

                /*/
            else if (prev+a[j]>=x)
                {
                    prev+=a[n-1-r_counter];
                    prev=prev%x;
                    prev+=a[j];
                    ans.append(a[n-1-r_counter]+" ");

                    count+=a[n-1-r_counter];
                    ans.append(a[n-1-r_counter]+" "+a[j]+" ");
                    r_counter++;
                }
            }
             */
            System.out.println(count);
            System.out.println(ans);
        }
    }
}