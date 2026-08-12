
import java.util.*;
import java.io.*;

public class Inversion_of_a_subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String a1 = br.readLine();
            String b1 = br.readLine();
            if(a1.equals(b1))
            {
                System.out.println(0);
                continue;
            }
            String[] a = a1.split(" ");
            String[] b = b1.split(" ");
            int sum = 0,frequency_a=0,frequency_b=0;
            for (int j = 0; j < n; j++) {
                if(!a[j].equals(b[j]))
                    sum+=Integer.parseInt(a[j]);
                if(a[j].equals("0"))
                    frequency_a++;
                if(b[j].equals("1"))
                    frequency_b++;
            }
            if(frequency_a==n || frequency_b==n)
                System.out.println(-1);
            else if((sum)%2==1)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
