import java.util.Scanner;

public class Candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n =sc.nextLong();
            if(n<=2)
                System.out.println(0);
            else
            {
                if(n%2==0)
                    System.out.println((n/2)-1);
                else
                    System.out.println(n/2);
            }
        }
    }
}
