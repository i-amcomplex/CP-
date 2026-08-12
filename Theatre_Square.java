import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n =sc.nextLong();
        long m =sc.nextLong();
        long a =sc.nextLong();
        long ans=0;
        if(m%a==0 && m/a>=1)
        {
            ans+=m/a;
        }
        else if (a>m)
        {
            ans+=1;
        }
        else
        {
            ans+=(m/a)+1;
        }
        if(n%a==0 && n/a>=1)
        {
            ans*=n/a;
        }
        else if(a>n)
        {
            ans*=1;
        }
        else
        {
            ans*=(n/a)+1;
        }
        System.out.println(ans);
    }
}