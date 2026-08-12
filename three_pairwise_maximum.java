import java.util.Scanner;

public class three_pairwise_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();
        for (int i = 0; i < t; i++) {
            long a =sc.nextLong();
            long b =sc.nextLong();
            long c =sc.nextLong();
            if(a==b){
                if(a>=c)
                {
                    System.out.println("YES");
                    System.out.println(a+" "+c+" "+c);
                }
                else
                    System.out.println("NO");
            }
            else if(b==c)
            {
                if(b>=a)
                {
                    System.out.println("YES");
                    System.out.println(a+" "+b+" "+c);
                }
                else
                    System.out.println("NO");
            }
            else if(c==a)
            {
                if(a>=b)
                {
                    System.out.println("YES");
                    System.out.println(a+" "+b+" "+b);
                }
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}
