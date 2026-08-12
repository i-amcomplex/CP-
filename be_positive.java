import java.util.Scanner;
public class be_positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a = new int[n];
            int neg=0,ans=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                if(a[j]==-1)
                    neg++;
                else if(a[j]==0)
                    ans+=1;
            }
            if(neg%2==1)
                ans+=2;
            System.out.println(ans);
        }
    }
}
