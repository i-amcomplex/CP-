import java.util.Scanner;

public class line_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int max=a[0];
            for (int j = 0; j < n-1; j++) {
                if(max<a[j+1]-a[j])
                    max=a[j+1]-a[j];
            }
            System.out.println(Math.max(max,2*(x-a[n-1])));
        }
    }
}
