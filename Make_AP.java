import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i <t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long actuala=2*b-c;
            long actualb=(a+c)/2;
            long actualc=2*b-a;
            boolean ans= false;
            if(actuala%a==0 && actuala/a>0)
                ans=true;
            if(actualb%b==0 && actualb/b>0 && (c-a)%2==0)
                ans=true;
            if(actualc%c==0 && actualc/c>0)
                ans=true;
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}