import java.util.Scanner;

public class one_and_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            int prod=1;
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
                prod*=arr[j];
            }
            int prod2=arr[0],check=-1;
            prod/=arr[0];
            for (int j = 1; j < n; j++) {
                prod2*=arr[j];
                prod/=arr[j];
                if(prod2==prod){
                    check=j+1;
                    break;
                }
            }
            if(check>n-1)
                System.out.println(-1);
            else
                System.out.println(check);
        }
    }
}
