import java.util.Scanner;

public class Right_Maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            a[0]=sc.nextInt();
            int max=0;
            int count=1;
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextInt();
                if(a[max]<=a[j]) {
                    count++;
                    max = j;
                }
            }
            System.out.println(count);
        }
    }
}
