import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int flag=0;
        for (int i = 0; i < a.length(); i++) {
            if ((int) (a.charAt(i) - 'a') > (int) (b.charAt(i) - 'a')){
                flag = 1;
                break;
            }
            else if((int) (a.charAt(i) - 'a') < (int) (b.charAt(i) - 'a'))
            {
                flag = -1;
                break;
            }
        }
        System.out.println(flag);
    }
}
