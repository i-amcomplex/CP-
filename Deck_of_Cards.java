import java.util.*;
public class Deck_of_Cards {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            String s = sc.next();
            char[] ans = new char[n];
            for (int j = 0; j < n; j++) {
                ans[j]='+';
            }
            // if equal then everything will be -
            int top=0,low=0,uncer=0;
            for (int j = 0; j < k; j++) {
                if (s.charAt(j) == '0')
                    top++;
                else if (s.charAt(j) == '1')
                    low++;
                else
                    uncer++;
            }
            if(n==k)
            {
                for (int j = 0; j < n; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < top; j++)
                    ans[j] = '-';
                for (int j = n - low; j < n; j++)
                    ans[j] = '-';
                for (int j = top; j < Math.min(top + uncer, n - low); j++)
                    ans[j] = '?';
                for (int j = Math.max(n - low - uncer, top); j < n - low; j++)
                    ans[j] = '?';
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[j]);
                }
                System.out.println();
            }
        }
    }
}