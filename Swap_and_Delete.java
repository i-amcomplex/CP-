import java.util.Scanner;
public class Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s =sc.next();
            int zer=0,one=0;
            for (int j = 0; j < s.length() ; j++) {
                if(s.charAt(j)=='0')
                    zer++;
                else
                    one++;
            }
            int ans=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='0') {
                    if (one > 0) {
                        one--;
                    }
                    else {
                        ans+=s.length()-j;
                        break;
                    }
                }
                else {
                    if (zer > 0) {
                        zer--;
                    }
                    else {
                        ans+=s.length()-j;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
