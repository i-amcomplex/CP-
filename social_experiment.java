import java.util.Scanner;

//https://codeforces.com/problemset/problem/2184/A
public class social_experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            if (n==2 || n==3)
                System.out.println(n);
            else
                System.out.println(n%2);
            }
        }
    }

