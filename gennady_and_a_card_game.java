import java.util.Scanner;

public class gennady_and_a_card_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String s1=sc.nextLine().trim();
        int ans=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s.charAt(0))
                ans++;
            else if(s1.charAt(i)==s.charAt(1))
                ans++;
        }
        if(ans>=1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
