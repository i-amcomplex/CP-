import java.util.Scanner;

public class park_lighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int m = sc.nextInt();
            int ans=0;
            if(m%2==0)
            {
                ans=(int)(m/2);
                ans*=n;

            }
            else
            {
                ans=n*(int)(m/2);
                if(n%2==0)
                {
                    ans+=n/2;
                }
                else
                {
                    ans+=(int)(n/2)+1;
                }
            }
            System.out.println(ans);
        }
    }
}
