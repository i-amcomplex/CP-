import java.util.*;

public class Helmets_in_Night_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int p = sc.nextInt();
            long[][] a = new long[n][2];
            for (int j = 0; j < n; j++) {
                a[j][1]=sc.nextLong();
            }
            for (int j = 0; j < n; j++) {
                a[j][0]=sc.nextLong();
            }
            Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));
            long cost=p;
            long count=1;
            for (int j = 0; j < n && count<n; j++) {
                if((long)(a[j][0])<p)
                {
                    cost+=a[j][0];
                    count+=a[j][1];
                }
                else
                {
                    cost+=p;
                    count+=1;
                }
            }
            System.out.println(cost);
        }
    }
}
