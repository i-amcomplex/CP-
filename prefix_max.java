import java.util.Scanner;

public class prefix_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a = new int[n];
            int max=0,sum=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                max=Math.max(max,a[j]);
            }
            System.out.println(max*n);
        }
    }
}
