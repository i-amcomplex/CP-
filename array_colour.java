import java.util.Scanner;

public class array_colour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int a[]= new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int x=a[0]%2,count=0;
            for (int j = 0; j < n; j+=2) {
                if(a[j]%2==x)
                    continue;
                else
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
