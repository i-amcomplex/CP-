import java.awt.*;
import java.util.Scanner;

public class sum_sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n= sc.nextInt();
            if(n<9)
            {
                System.out.println((int)((n*(n+1))/2));
            }
            else
            {

            }
        }
    }
}
