import java.util.Scanner;

public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n =sc.nextLong();
        int w = sc.nextInt();
        if(n<(((long) w *(w+1))/2*k))
            System.out.println((((long) w *(w+1))/2*k)-n);
        else
            System.out.println(0);
    }
}
