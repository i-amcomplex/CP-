import java.util.Scanner;
//https://codeforces.com/problemset/problem/2171/A
public class farmlegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n = sc.nextInt();
            if(n%2!=0) {
                System.out.println("0");
                continue;
            }
            System.out.println((n/4)+1);
        }
    }
}
