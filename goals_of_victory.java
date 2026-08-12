import java.util.Scanner;

public class goals_of_victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n-1];
            int sum=0;
            for (int j = 0; j < n-1; j++) {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            System.out.println(-sum);
        }
    }
}
