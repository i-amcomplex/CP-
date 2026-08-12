import java.io.*;
import java.util.*;
public class Palindrome_Twelve_and_Two_Terms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            if(n<10)
            {
                System.out.println(n+" "+ "0");
            }
            else if(n%12==0)
            {
                System.out.println("0"+" "+n);
            }
            else if(n%12!=10){
                long out= n/12;
                System.out.println(n%12+" "+(n-n%12));
            }
            else if (n%12==10)
            {
                if(n>=22)
                {
                    System.out.println(22+" "+(n-22));
                }
                else
                {
                    System.out.println("-1");
                }
            }
        }
    }
}
