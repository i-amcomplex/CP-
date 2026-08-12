import java.util.Scanner;

public class multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();
        for (int i = 0; i < t; i++) {
            long a =sc.nextLong();
            int m=0,n=0;
            long temp=a,temp1=a;
            while(temp%2==0){
                temp/=2;
                n++;
            }
            while(temp1%3==0){
                temp1/=3;
                m++;
            }
            if(a/(Math.pow(2,n)*Math.pow(3,m))==1)
            {
                if(n>m)
                    System.out.println(-1);
                else
                    System.out.println(2*m-n);
            }
            else
                System.out.println(-1);
        }
    }
}
