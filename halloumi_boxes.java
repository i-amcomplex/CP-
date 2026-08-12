import java.util.Scanner;

public class halloumi_boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a= new int[n];
            for (int j = 0; j < n; j++){
                a[j]=sc.nextInt();
            }
            if(k>=2)
            {
                System.out.println("YES");
            }
            else
            {
                int check=0;
                for (int j = 0; j < n-1; j++) {
                    if(a[j]>a[j+1])
                    {
                        check++;
                        break;
                    }
                }
                if(check!=0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
