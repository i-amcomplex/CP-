import java.util.Scanner;

public class seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n = sc.nextInt();
            int count=0;
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (j != 0 && j != s.length - 1 && s[j - 1] == '0' && s[j + 1] == '0') {
                    s[j] = '1';
                    count++;
                } else if (s[j] == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}