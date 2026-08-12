import java.util.Scanner;

public class Permutation_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n =sc.nextLong(),first=n,second=0;
            if(first%2==0)
                second=1;
            else
                second=2;
            for (int j = 1; j <= n; j++) {
                if(j%2==1)
                {
                    System.out.print(first+" ");
                    first-=2;
                }
                else {
                    System.out.print(second+" ");
                    second += 2;
                }
            }
            System.out.println();
        }
    }
}