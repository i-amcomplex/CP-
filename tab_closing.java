import java.util.Scanner;

public class tab_closing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (int i = 1; i <=t ; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            if(b*n<=a || a<=b)
                System.out.println("1");
            else
                System.out.println("2");
        }
    }
}
