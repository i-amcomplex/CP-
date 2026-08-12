
import java.util.Scanner;

public class square_questionmark {
    public static void main(String[] args) {
        //https://codeforces.com/problemset/problem/2167/A
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int s1,s2,s3,s4;
            s1= sc.nextInt();
            s2= sc.nextInt();
            s3= sc.nextInt();
            s4= sc.nextInt();
            System.out.println((s1==s2 && s2==s3 && s3==s4)?"YES":"NO");
        }
    }
}
