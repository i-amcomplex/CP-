import java.util.*;
import java.io.*;

public class The_Best_Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if(isPrime(n+1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean isPrime(int n)
    {
        for (int i = 2; i*i<=n ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
