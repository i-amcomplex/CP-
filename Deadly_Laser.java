import java.util.*;
public class Deadly_Laser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int m =sc.nextInt();
            int sx=sc.nextInt();
            int sy=sc.nextInt();
            int d=sc.nextInt();
            boolean ans = false;
            // checking if 1,1 is trapped
            if(sx-1>d && m-sy>d)
                ans=true;
            else if(sy-1>d && n-sx>d)
                ans=true;
            if(ans)
            {
                System.out.println(n+m-2);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}
