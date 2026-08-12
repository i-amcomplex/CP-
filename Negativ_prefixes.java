import java.util.*;
import java.io.*;

public class Negativ_prefixes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n  = Integer.parseInt(br.readLine());
            int[] a= new int[n];
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in.nextToken());
            }
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            ArrayList<Integer> index = new ArrayList<>();
            ArrayList<Integer> val = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(Integer.parseInt(in1.nextToken())==0) {
                    index.add(j);
                    val.add(a[j]);
                }
            }
            Collections.sort(val);
            int pointer1=0;
            while(pointer1<val.size())
            {
                a[index.get(pointer1)]= val.get(val.size()-1-pointer1);
                pointer1++;
            }
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < n; j++) {
                ans.append(a[j]+" ");
            }
            System.out.println(ans);
        }
    }
}
