import java.util.Scanner;

public class longest_divisor_interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            int count=0;
            for (int j = 1; j <=n ; j++) {
                if(n%j!=0)
                    break;
                else
                    count++;
            }
            System.out.println(count);
        }
    }
}
