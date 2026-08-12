import java.util.Scanner;

public class Array_colouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            int oddcount=0;
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
                if(arr[j]%2==1)
                    oddcount++;
            }
            if(oddcount%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
