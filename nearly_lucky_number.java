import java.util.Scanner;

public class nearly_lucky_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int ans=0;
        for (int i = 0; i < Long.toString(n).length(); i++) {
            if(Long.toString(n).charAt(i)=='4'||Long.toString(n).charAt(i)=='7')
                ans++;
        }
        if(ans==7 || ans==4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
