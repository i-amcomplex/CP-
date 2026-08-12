import java.util.Scanner;

public class heapify_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] index = new int[2];
            int count = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if(j%2==0 && a[j]%2==0){
                    count++;
                    break;
                }
                else if (j%2==1 && a[j]%2==1)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
