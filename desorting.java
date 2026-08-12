import java.util.Scanner;

public class desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n = sc.nextInt();
            int checking=0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int diff=arr[1]-arr[0];
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1])
                    checking++;
                else
                    diff=Math.min(diff,arr[j+1]-arr[j]);
            }
            if(checking>0)
                System.out.println("0");
            else
            {
                System.out.println((diff/2)+1);
            }
        }
    }
}
