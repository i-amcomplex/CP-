import java.util.Scanner;

public class collecting_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();
        for (int i = 0; i < t; i++) {
            long a =sc.nextLong();
            long b =sc.nextLong();
            long c =sc.nextLong();
            long n =sc.nextLong();
            n-=3*Math.max(a,Math.max(b,c))-a-b-c;
            if(n>0 && n%3==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
