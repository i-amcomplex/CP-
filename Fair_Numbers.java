import java.util.Scanner;
public class Fair_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            while(!check(a))
            {
                a++;
            }
            System.out.println(a);
        }
    }
    public static boolean check(long n)
    {
        boolean ans = true;
        long temp = n;
        long div=temp%10;
        while(temp>0)
        {
            div=temp%10;
            if(div!=0 && n%div!=0)
            {
                ans=false;
                break;
            }
            temp/=10;
        }
        return ans;
    }
}
