import java.util.Scanner;

public class maximum_increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0,count=0;
        long[] a = new long[n];
        a[0]=sc.nextLong();
        for (int i = 1; i < n; i++) {
            a[i]= sc.nextLong();
            if(a[i]>a[i-1])
                count++;
            else
            {
                ans=Math.max(ans,count+1);
                count=0;
            }
        }
        ans=Math.max(ans,count+1);
        System.out.println(ans);
    }
}
