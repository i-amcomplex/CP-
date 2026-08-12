import java.util.Scanner;

public class Yet_another_two_integer_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b =sc.nextLong();
            long ans = Math.abs(a-b)/10;
            if(Math.abs(a-b)%10!=0)
            {
                ans+=1;
            }
            System.out.println(ans);
        }
    }
}
