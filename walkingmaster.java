import java.util.Scanner;

public class walkingmaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b>d)
                System.out.println(-1);
            else if(a<b+c-d)
                System.out.println(-1);
            else
                System.out.println((a-2*b+2*d-c));
        }
    }
}
