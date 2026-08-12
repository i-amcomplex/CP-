import java.io.*;
import java.util.*;
public class Permutations {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n =Long.parseLong(br.readLine());
        if(n>3 || n==1)
        {
            // printing odd numbers
            StringBuilder s = new StringBuilder();
            for (long i = 2; i <= n; i+=2) {
                s.append(i+" ");
            }
            for (long i = 1; i <= n; i+=2) {
                s.append(i+" ");
            }
            System.out.println(s);
        }
        else
        {
            System.out.println("NO SOLUTION");
        }
    }
}
