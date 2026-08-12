import java.util.Scanner;

public class XOR_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x=sc.nextLong();
            long y=sc.nextLong();
            long ans=x^y;
            System.out.println(Long.lowestOneBit(ans));
        }
    }
}
