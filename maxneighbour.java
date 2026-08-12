import java.util.Scanner;
//https://codeforces.com/problemset/problem/2170/A
public class maxneighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            if (n>=5)
            {
                int ans=(n*n-1)+(n*(n-1))+(n*(n-1)-1)+(n*(n-1)-2)+(n*(n-2)-1);
                System.out.println(ans);
            }
            else {
                if(n==1)
                    System.out.println(1);
                else if (n==2)
                    System.out.println(9);
                else if(n==3)
                    System.out.println(29);
                else
                    System.out.println(56);
            }
        }
    }
}
