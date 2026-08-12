import java.util.Scanner;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        // separate case for 4
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt()%k;
            }
            // check if no of 1 are greater than 2
            // for cases 2,3,5
            // check the maximum and subtract the maximum from k
            // for 4 case
            if(k!=4)
            {
                int max=0;
                long prod=1;
                for (int j = 0; j < n; j++) {
                    prod*=a[j];
                    if(a[max]<a[j])
                        j=max;
                }
                if(prod==0)
                    System.out.println(0);
                else
                    System.out.println(k-a[max]);
            }
            else
            {
                int one_count=0,two_count=0,three_count=0;
                long prod=1;
                for (int j = 0; j < n; j++) {
                    prod*=a[j];
                    if(a[j]==1)
                        one_count++;
                    else if (a[j]==2)
                        two_count++;
                    else if (a[j]==3)
                        three_count++;
                }
                if(prod%4==0)
                    System.out.println(0);
                else if(three_count>0 || (two_count>0 && one_count>0))
                    System.out.println("1");
                else if((one_count>1 && two_count==0) || (two_count>0 && one_count==0))
                    System.out.println("2");
            }
        }
    }
}
