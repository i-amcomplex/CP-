import java.util.Scanner;

public class Crafting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            for (int j = 0; j < n; j++) {
                b[j]=sc.nextLong();
            }
            long maxdiff=a[0]-b[0];
            for (int j = 0; j < n; j++) {
                maxdiff=Math.min(a[j]-b[j],maxdiff);
            }
            // found the maximum difference needed to make the array crafted
            // the maximum difference that is negative
            // after finding the maximum difference i will subtract that much amount from each element and flag
            if(maxdiff<0)
            {
                int flag=0;
                for (int j = 0; j < n; j++) {
                    if(a[j]+maxdiff>=0 && a[j]+maxdiff>=b[j])
                        continue;
                    else {
                        flag +=1;
                    }
                }
                if(flag<=1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}
