import java.util.Scanner;

public class operation_with_inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int []arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=sc.nextInt();
            }
            int count=0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j+1]-arr[j]<0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
