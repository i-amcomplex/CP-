import java.util.Scanner;

public class palindrome_twist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            String s = sc.next().trim();
            int start=0,end=n-1;
            boolean ans=true;
            while(end>=start)
            {

                if(s.charAt(start)==s.charAt(end)||s.charAt(start)-1==s.charAt(end)-1||s.charAt(start)-1==s.charAt(end)+1||s.charAt(start)+1==s.charAt(end)+1||s.charAt(start)+1==s.charAt(end)-1) {
                    end--;
                    start++;
                }
                else {
                    ans = false;
                    break;
                }

            }
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
