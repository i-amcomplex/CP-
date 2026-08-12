import java.util.*;
public class Lady_Bug {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            // down diagonals ka one and zero
            // up diagonals ka one and zero
            boolean ans=false;
            int zero_a=0,zero_b=0;
            for (int j = 0; j < n; j++) {
                if(a.charAt(j)=='0' && j%2==0)
                    zero_a++;
                else if (j%2==1 && b.charAt(j)=='0') {
                    zero_a++;
                }
            }
            for (int j = 0; j < n; j++) {
                if(b.charAt(j)=='0' && j%2==0)
                    zero_b++;
                else if (j%2==1 && a.charAt(j)=='0') {
                    zero_b++;
                }
            }
            // for odd case my zero_a should be greater than equal to n/2 + 1
            // for even case both should be greater than equal to n/2
            if(n%2==1)
            {
                if(zero_a>=n/2+1 && zero_b>=n/2)
                    ans=true;
            }
            else
            {
                if(zero_a>=n/2 && zero_b>=n/2)
                    ans=true;
            }
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
