import java.util.Scanner;

public class word_capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)>=97 )
            System.out.println((s.charAt(0)+"").toUpperCase()+""+s.substring(1,s.length()));
        else
            System.out.println(s);
    }
}
