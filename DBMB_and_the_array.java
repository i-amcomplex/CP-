import java.util.Scanner;

public class DBMB_and_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            if((sum-s)%x==0 && s>=sum){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
