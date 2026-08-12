import java.util.Scanner;

public class Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            long q = sc.nextLong();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            long consec=0;
            long count=0;
            for (int j = 0; j < n; j++) {
                if(a[j]<=q)
                {
                    consec++;
                }
                else
                {
                    if(consec>=k)
                    {
                        count+=((long)(consec-k+1)*(consec-k+2))/2;
                    }
                    consec=0;
                }
            }
            if(consec>=k)
            {
                count+=((long)(consec-k+1)*(consec-k+2))/2;
            }
            System.out.println(count);
        }
    }
}
