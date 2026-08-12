import java.util.Scanner;

public class _01_GAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next().trim();
            int one=0,even=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='0')
                    even++;
                else
                    one++;
            }
            even=Math.min(even,one);
            if(even%2==0)
                System.out.println("NET");
            else
                System.out.println("DA");

        }
    }
}
