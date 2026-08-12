import java.util.Scanner;

public class sum_of_medians {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            long[] a = new long[n*k];
            for (int j = 0; j < n*k; j++) {
                a[j]=sc.nextLong();
            }
            int index=0,sub=0;
            if(n%2==0)
            {
                index=(n*k)-1-n/2;
                sub=n/2+1;

            }
            else
            {
                index=(n*k)-1-n/2;
                sub=n/2+1;
            }
            long ans=0;
            for (int j = 1; j <=k ; j++) {
                ans+=a[index];
                index-=sub;
            }
            System.out.println(ans);
        }
    }
}
