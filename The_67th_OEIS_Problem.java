import java.io.*;
import java.util.*;
public class The_67th_OEIS_Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long k = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(k*(k+2)+" ");
                k+=2;
            }
            System.out.println();
        }
    }
    // or i can also print odd numbers
    // need to precompute 10^4 the prime numbers
}
