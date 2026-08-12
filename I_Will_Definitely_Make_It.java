import java.io.*;
import java.util.*;
public class I_Will_Definitely_Make_It {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int k = Integer.parseInt(in.nextToken());
            long[] a = new long[n];
            StringTokenizer in1 = new StringTokenizer(in.nextToken());
            for (int j = 0; j < n; j++) {
                a[j]=Long.parseLong(in1.nextToken());
            }
            long curr = a[k-1];
            int time = 0;
            Arrays.sort(a);
            boolean ans = true;
            if(curr == a[n-1])
            {
                System.out.println("YES");
            }
            else {
                // find the location where curr is in the array
                int index = 0;
                long waterlevel=0;
                for (int j = 0; j < n; j++) {
                    if(curr==a[j])
                    {
                        j=index;
                        break;
                    }
                }
                // now i have my index
                // for the first check it should be ke if the difference in height
                // and then continue on
                // if difference is equal tab kya hoga?
                if(a[index+1]-curr<curr)
                {
                    ans=false;
                }
                else
                {
                    waterlevel=a[index+1]-curr;
                }
                if(!ans)
                    System.out.println("NO");
                else
                {
                    for (int j = index+2; j <n ; j++) {
                        if(a[j]-a[j-1]<waterlevel)
                        {
                            ans=false;
                        }
                    }
                }
            }
        }
    }
}
