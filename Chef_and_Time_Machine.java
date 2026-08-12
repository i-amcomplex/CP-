import java.util.*;
import java.io.*;
// https://www.codechef.com/problems/CHEFTMA
public class Chef_and_Time_Machine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int k = Integer.parseInt(in.nextToken());
            int m = Integer.parseInt(in.nextToken());
            int[] a = new int[n];
            int[] b = new int[n];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in1.nextToken());
            }
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                b[j]=Integer.parseInt(in2.nextToken());
            }
            // now let me think one of them reduces the amount of planned task and one increases
            // so if any of them are greater than the difference I cannot use it
            // so I will sort it and then check if any number exactly fits or i will just iterate through the loop
            // and check the best possible case
            StringTokenizer in3 = new StringTokenizer(br.readLine());
            ArrayList<Integer> c = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                c.add(Integer.parseInt(in3.nextToken()));
            }
            StringTokenizer in4 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                c.add(Integer.parseInt(in4.nextToken()));
            }
            Collections.sort(c);
            // now lets calculate the answer
            long ans = 0;
            int[] diff = new int[n];
            for (int j = 0; j < n; j++) {
                diff[j] = a[j]-b[j];
            }
            Arrays.sort(diff);
            int pointer1=n-1,pointer2=c.size()-1;
            while(pointer1>=0 && pointer2>=0)
            {
                if(diff[pointer1]>=c.get(pointer2))
                {
                    ans+=diff[pointer1]-c.get(pointer2);
                    pointer1--;
                    pointer2--;
                }
                else
                {
                    pointer2--;
                }
            }
            // now i am at pointer1 after all the calculations
            // so now i will start to add in my ans variable
            // from pointer2 value
            for (int j = pointer1; j >=0 ; j++) {
                ans+=diff[j];
            }
            System.out.println(ans);
        }
    }
}
