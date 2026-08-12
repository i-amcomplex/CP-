import java.util.Scanner;

public class daytona_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i =1; i <=t ; i++) {
            int n= sc.nextInt();
            int k=sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int flag=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==k)
                    flag++;
            }
            if(flag>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
