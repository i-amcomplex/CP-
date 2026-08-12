import java.util.Scanner;

public class array_with_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum =0,even=0,odd=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                sum+=a[j];
                if(a[j]%2==0)
                    even++;
                else
                    odd++;

            }
            if((even>=1 && odd>=1)|| sum%2==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
