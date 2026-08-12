import java.util.Arrays;
import java.util.Scanner;

public class isamatdin_and_his_magic_wand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int ans=0;
            for (int j = 0; j < n; j++) {
                if(a[j]%2!=a[0]%2) {
                    ans++;
                    break;
                }
            }
            if(ans!=0)
            {
                Arrays.sort(a);
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]+" ");
                }
            }
            else
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]+" ");
                }
            System.out.println();
        }
    }
}
