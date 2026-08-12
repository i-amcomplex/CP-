import java.util.Scanner;

public class The_67th_XOR_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            long ans=0;
            for (int j = 0; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if((a[j]^a[k])>ans)
                        ans=a[j]^a[k];
                }
            }
            System.out.println(ans);
        }
    }
}
