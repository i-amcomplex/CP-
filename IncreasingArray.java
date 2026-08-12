import java.util.*;
import java.io.*;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer in = new StringTokenizer(br.readLine());
        long ans= 0;
        int min = Integer.parseInt(in.nextToken());
        for (int i = 1; i < t; i++) {
            int temp=Integer.parseInt(in.nextToken());
            if(temp<min)
                ans+=min-temp;
            else
            {
                min=temp;
            }
        }
        System.out.println(ans);
    }
}
