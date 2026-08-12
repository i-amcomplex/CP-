import java.util.Arrays;
import java.util.Scanner;

public class Matryoshkas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[][] a= new long[n][];
            for (int j = 0; j < n; j++) {
                a[j][0]=sc.nextLong();
                a[j][1]++;
            }
            long count=0;
            Arrays.sort(a);
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
