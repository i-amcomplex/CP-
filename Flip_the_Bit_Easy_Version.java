import java.util.Scanner;

public class Flip_the_Bit_Easy_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int pivot=sc.nextInt();
            int left=0,r=0;
            for (int j = 0; j < pivot-1; j++) {
                if(a[j]!=a[pivot-1])
                    left++;
            }
            for (int j = pivot; j < n; j++) {
                if(a[j]!=a[pivot-1])
                    r++;
            }
            System.out.println(Math.max(r,left)*2);
        }
    }
}