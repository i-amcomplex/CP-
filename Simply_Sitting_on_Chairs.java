import java.util.Scanner;

public class Simply_Sitting_on_Chairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            int[] b=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                b[j]=0;
            }
            int ans=0;
            for (int j = 0; j < n; j++) {
                if(b[j]==1){
                    break;
                }
                else
                {
                    if(a[j]-1<=j)
                        ans++;
                    else
                        continue;
                }
            }
            System.out.println(ans);
        }
    }
}