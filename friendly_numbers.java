import java.util.Scanner;

public class friendly_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            int count=0;
            for (int j = 1; j < 82; j++) {
                long no=x+j;
                if(countsum(no)==j)
                    count++;
            }
            System.out.println(count);
        }
    }
    public static long countsum(long k){
        long a = 0;
        while(k>0)
        {
            a+=k%10;
            k/=10;
        }
        return a;

    }
}
