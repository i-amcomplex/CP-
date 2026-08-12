import java.util.Arrays;
import java.util.Scanner;

public class table_with_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int count1=0,count2=0;

            for (int j = 0; j < n-1; j++) {
                if(a[j]<=Math.min(l,h))
                    count1++;
                else if(a[j]<=Math.max(l,h))
                    count2++;
            }
            System.out.println(Math.max(count1,count2)/2);
        }
    }
}
