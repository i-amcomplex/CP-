import javax.swing.*;
import java.util.Scanner;

public class vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();
            long min=((k*(k+1))/2);
            long max=(k*(k-1))/2;
            if(min<=x && (n*k-max)>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
