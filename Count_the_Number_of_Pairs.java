import java.io.*;
import java.util.*;
public class Count_the_Number_of_Pairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n= Integer.parseInt(in.nextToken());
            int k = Integer.parseInt(in.nextToken());
            String a = br.readLine();
            HashMap<Character,Integer> mapy = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if(mapy.containsKey(a.charAt(j)))
                    mapy.put(a.charAt(j),mapy.get(a.charAt(j))+1);
                else
                    mapy.put(a.charAt(j),1);
            }
            // now i have every thing in an Hashmap
            // so now calculate the number of blurs right now
            // after that calculate the excess
            for (int j = 0; j < mapy.size(); j++) {
            }
        }
    }
}
