import java.io.*;
import java.util.*;
public class Snowfall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            ArrayList<Long> mod3 = new ArrayList<>();
            ArrayList<Long> mod2 = new ArrayList<>();
            ArrayList<Long> mod6 = new ArrayList<>();
            ArrayList<Long> elsa = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                long a = Long.parseLong(in.nextToken());
                if(a%6==0)
                    mod6.add(a);
                else if (a%3==0)
                    mod3.add(a);
                else if (a%2==0)
                    mod2.add(a);
                else
                    elsa.add(a);
            }
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < mod3.size(); j++) {
                ans.append(mod3.get(j)+" ");
            }
            for (int j = 0; j < elsa.size(); j++) {
                ans.append(elsa.get(j) + " ");
            }
            for (int j = 0; j < mod2.size(); j++) {
                ans.append(mod2.get(j)+" ");
            }
            for (int j = 0; j < mod6.size(); j++) {
                ans.append(mod6.get(j)+" ");
            }
            System.out.println(ans);
        }
    }
}
