import java.util.Scanner;
public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if("aoyeui".contains(s.charAt(i)+""))
                continue;
            else
                System.out.print("."+s.charAt(i));
        }
    }
}
