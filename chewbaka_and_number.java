import java.util.Scanner;

public class chewbaka_and_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='5')
                temp=temp*10+(int)(s.charAt(i)-'0');
            else
                temp=temp*10+(9-(int)(s.charAt(i)-'0'));
        }
        System.out.println(temp);
    }
}
