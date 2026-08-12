import java.util.Scanner;

public class good_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int consecutiveodd=0,consecutive_even=0,count=0;
            for (int j = 0; j < n; j++) {
                if(a[j]%2==0)
                {
                    if(consecutiveodd>1)
                        count+=consecutiveodd-1;
                    consecutiveodd=0;
                    consecutive_even++;
                    if(j==n-1 && consecutive_even>1)
                        count+=consecutive_even-1;
                }
                else
                {
                    if(consecutive_even>1)
                        count+=consecutive_even-1;
                    consecutive_even=0;
                    consecutiveodd++;
                    if(j==n-1 && consecutiveodd>1)
                        count+=consecutiveodd-1;
                }
            }
            System.out.println(count);
        }
    }
}
