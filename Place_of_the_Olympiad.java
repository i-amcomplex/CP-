import java.util.Scanner;

public class Place_of_the_Olympiad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n =sc.nextLong();
            long m =sc.nextLong();
            long k =sc.nextLong();
            long x=k/n;
            if(k%n!=0)
                x+=1;
            long count=0;
            if(x==m)
            {
                System.out.println(m);
            }
            else
            {
                if(m%2==0)
                {
                    if(x<=m/2)
                    {
                        System.out.println("1");
                    }
                    else
                    {
                        // so i have m-x spaces
                        long spaces=(m-x);
                        for (int j = 0; j <spaces; j++) {
                            if(j%2!=0){
                                continue;
                            }
                            else {
                                if (x % 2 != 0)
                                    x = x / 2 + 1;
                                else
                                    x /= 2;
                            }
                        }
                        System.out.println(x);
                    }
                }
                else {
                    if(x<=m/2+1)
                    {
                        System.out.println(1);
                    }
                    else
                    {
                        long spaces=(m-x);
                        for (int j = 0; j <spaces; j++) {
                            if(j%2!=0){
                                continue;
                            }
                            else {
                                if (x % 2 != 0)
                                    x = x / 2 + 1;
                                else
                                    x /= 2;
                            }
                        }
                        System.out.println(x);
                    }
                }
            }
        }
    }
}
