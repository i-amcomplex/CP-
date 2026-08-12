import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        String a =sc.next();
        int ans=0;
        for (int i = 0; i < t-1; i++) {
            if(a.charAt(i)==a.charAt(i+1))
                ans++;
        }
        System.out.println(ans);
    }
}
