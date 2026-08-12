import java.util.*;
import java.io.*;

public class Distinct {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        HashMap<Long, Integer> a= new HashMap<>();
        StringTokenizer st = new StringTokenizer(sc.readLine());
        for (int i = 0; i < n; i++) {
            long temp =Long.parseLong(st.nextToken());
            if(!a.containsKey(temp))
                a.put(temp,1);
        }
        System.out.println(a.size());
    }
}
