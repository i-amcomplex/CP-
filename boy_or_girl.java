import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if(ans.contains(s.charAt(i)+""))
                continue;
            else
                ans+=s.charAt(i);
        }
        if(ans.length()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
