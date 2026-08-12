import java.io.*;
import java.util.*;
public class Different_Divisors {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long d = Long.parseLong(br.readLine());
            long ans = (1 + d) * (1 + 2 * d) ;
            System.out.println(ans);
        }
    }
}
