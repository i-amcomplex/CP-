import java.util.*;
import java.io.*;
public class Yet_Another_Card_Deck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(in.nextToken());
        int q = Integer.parseInt(in.nextToken());
        int[] a= new int[n];
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> ans = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(in1.nextToken());
            if(ans.containsKey(a[i]))
            {
                continue;
            }
            else
            {
                ans.put(a[i],i);
            }
        }
        int[] queries= new int [q];
        StringTokenizer in2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < q; i++) {
            queries[i]=Integer.parseInt(in2.nextToken());
        }
        // so first query
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int index = ans.get(queries[i])+1;
            answer.append(index+" ");
            // now i need to update
            // lets get the keys ka set into a array list
            ArrayList<Integer> keys = new ArrayList<>(ans.keySet());
            for (int j = 0; j < keys.size(); j++) {
                if(ans.get(keys.get(j))<index)
                {
                    ans.put(keys.get(j),ans.get(keys.get(j))+1);
                }
            }
            ans.put(queries[i],0);
        }
        System.out.println(answer);
    }

}
