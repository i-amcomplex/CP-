import java.util.Scanner;

public class yes_or_yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int ans= 1;
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length()-1; j++) {
                if(s.charAt(j)=='Y' && s.charAt(j+1)=='Y') {
                    ans ++;
                    break;
                }
            }
            if(ans==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
