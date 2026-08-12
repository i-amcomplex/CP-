import java.util.Scanner;

public class Course_Wishes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            int[] a = new int[k];
            for (int j = 0; j < k; j++) {
                a[j] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j]=sc.nextInt();
            }

        }
    }
}
