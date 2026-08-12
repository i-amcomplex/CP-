import java.util.Scanner;

public class Avtobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n =sc.nextLong();
            //maximum case;
            long max=-1,min=-1;
            if(n%2==1 || n<4)
            {
                System.out.println("-1");
            }
            else
            {
                max=n/4;
                if(n%6==0)
                    min=n/6;
                else if (n%6==2||n%6==4)
                    min=(n/6)+1;
                if((n%4)%2==1 || (n%6)%2==1)
                    System.out.println("-1");
                else
                    System.out.println(min+" "+max);
            }
        }
    }
}
