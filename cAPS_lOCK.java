import java.util.Scanner;
public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 65 && (int) (s.charAt(i)) <= 97) {
                flag++;
            } else {

            }
        }
        if (flag == s.length()) {
            System.out.println(s.toLowerCase());
        } else if (s.length() == 1) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s);
        }
    }
}