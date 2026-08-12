
import java.util.Scanner;

public class mocha_army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int check=-1;
            for (int j = 0; j <= n-2; j++) {
                for (int k = j+1; k < n; k++) {
                    if (findGCD(arr[j], arr[k]) == 1 || findGCD(arr[j], arr[k]) == 2){
                        check++;
                        break;
                    }
                }
            }
            if(check!=-1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a); // Base case: GCD is 'a' when 'b' becomes 0. Handles negative inputs.
        }
        return findGCD(b, a % b); // Recursive call with b and the remainder
    }
}
