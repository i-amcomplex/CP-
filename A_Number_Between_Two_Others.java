import java.io.*;
import java.util.*;
public class A_Number_Between_Two_Others {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if(y<=2*x)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
