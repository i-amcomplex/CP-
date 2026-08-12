import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int lower=0,upper=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                lower++;
            else
                upper++;
        }
        if(upper>lower)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}
