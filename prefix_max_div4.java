import java.util.Scanner;
public class prefix_max_div4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int []arr= new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int max=arr[0];
            for (int j = 1; j < n; j++) {
                if(max<arr[j])
                    max=arr[j];
            }
            System.out.println(n*max);
        }
    }
}
