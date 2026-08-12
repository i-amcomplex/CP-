import java.io.*;
import java.util.*;
public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.print(n+" ");
        while (n!=1)
        {
            if(n%2==0) {
                n = n / 2;
                System.out.print((long) (n)+" ");

            }
            else
            {
                n= (n*3) + 1;
                System.out.print(n+" ");
            }
        }
    }
}
