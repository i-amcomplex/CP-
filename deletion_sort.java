import java.util.Scanner;

public class deletion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }

            int count=0;
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1])
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(n);
            }
            else
                System.out.println("1");
        }
    }
}
