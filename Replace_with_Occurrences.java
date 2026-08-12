import java.io.*;
import java.util.*;
public class Replace_with_Occurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] b = new int[n];
            StringTokenizer in = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> a = new HashMap<>();
            int max = -1;
            boolean check = true;
            for (int j = 0; j < n; j++) {
                b[j]=Integer.parseInt(in.nextToken());
                max = Math.max(max,b[j]);
                if(a.containsKey(b[j]))
                {
                    a.put(b[j],a.get(b[j])+1);
                }
                else
                {
                    a.put(b[j],1);
                }
            }
            // now i have the frequency of each element so
            int temp =1;
            HashMap<Integer,Integer> number = new HashMap<>();
            StringBuilder ans = new StringBuilder();
            int printing =1;

            for (int j = 0; j < n; j++) {
                if(b[j]!=a.get(b[j]) && (b[j]!=1) && a.get(b[j])%b[j]!=0 ) {
                    check = false;
                    break;
                }
                else if(b[j]==1 && a.get(b[j])>1)
                {
                    ans.append(temp+" ");
                    temp++;
                }
                else if (!number.containsKey(b[j])) {
                    number.put(b[j], temp);
                    temp++;
                    ans.append(number.get(b[j])+" ");
                }
                else
                {
                    ans.append(number.get(b[j])+" ");
                }
            }
            if(check)
                System.out.println(ans);
            else
                System.out.println(-1);
        }
    }
}