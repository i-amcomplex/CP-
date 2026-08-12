import java.io.*;
import java.util.*;
public class Basketball_Together {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(in.nextToken());
        long d = Long.parseLong(in.nextToken());
        long[] p = new long[n];
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i]=Long.parseLong(in1.nextToken());
        }
        Arrays.sort(p);
        long count=0,left=0;
        for (int i = n-1; i >=0 ; i--) {
            long no = (d/p[i])+1;
            if(count+no>n)
            {
                break;
            }
            else
            {
                count+=no;
            }
            left++;
        }
        System.out.println(left);
    }
}
