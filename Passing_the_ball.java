import java.util.Scanner;

public class Passing_the_ball {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            String s=sc.next().trim();
            int ans=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='L')
                {
                    ans=j+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
