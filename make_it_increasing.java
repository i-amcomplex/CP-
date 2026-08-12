import java.util.Arrays;
import java.util.Scanner;

public class make_it_increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int flag=0;
            long[] a = new long[n];
            a[0]=sc.nextLong();
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextLong();
                if(a[j]>a[j-1])
                    continue;
                else
                    flag++;
            }
            if (flag==0)
            {
                System.out.println(0);
            }
            else
            {
                int count=0;
                int flag1=0;
                for (int j = n-2; j >=0 ; j--) {
                    if(a[j+1]==0) {
                        flag1++;
                        break;
                    }
                    else if(a[j]>=a[j+1] )
                    {
                        while(a[j]>=a[j+1]){
                            a[j]/=2;
                            count++;
                        }
                    }
                }
                if(flag1>0)
                    System.out.println("-1");
                else
                    System.out.println(count);
            }
        }
    }
}
