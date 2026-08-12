import java.util.Scanner;

public class dont_try_to_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            String x1=x+x;
            String x2=x1+x1;
            String x3=x2+x2;
            String x4=x3+x3;
            String x5=x4+x4;
            int ans=-1;
            if(x.contains(s))
                ans=0;
            else if(x1.contains(s))
                ans=1;
            else if(x2.contains(s))
                ans=2;
            else if(x3.contains(s))
                ans=3;
            else if(x4.contains(s))
                ans=4;
            else if(x5.contains(s))
                ans=5;
            System.out.println(ans);
        }
    }
}
