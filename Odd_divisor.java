import java.util.Scanner;

public class Odd_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        long[] a = new long[46];
        a[0]=2;
        for (int i = 1; i < 46; i++) {
            a[i]=a[i-1]*2;
        }
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            boolean ans = false;
            for (int j = 0; j < 46; j++) {
                if(a[j]==n)
                {
                    ans=true;
                    break;
                }
            }
            if(ans)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
