import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans=0;
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if(s.charAt(1)=='+')
                ans++;
            else
                ans--;
        }
        System.out.println(ans);
    }
}
