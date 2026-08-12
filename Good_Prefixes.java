import java.util.Scanner;

public class Good_Prefixes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a = new long[n];
            a[0]=sc.nextLong();
            long max=a[0],sum=0;
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextLong();
            }
            int count=0;
            for (int j = 0; j < n; j++) {
                sum += a[j];
                if (max < a[j])
                    max = a[j];
                if (sum == 2 * max)
                    count++;
            }
            System.out.println(count);
        }
    }
}
