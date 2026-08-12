import java.util.Scanner;
public class three_indices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int[] slope = new int[n-1];
            for (int j = 0; j < n-1; j++) {
                slope[j]=a[j+1]-a[j];
            }
            int index=-1;
            for (int j = 0; j < n-2; j++) {
                if(slope[j]>0 && slope[j+1]<0)
                {
                    index=j;
                    break;
                }
            }
            if(index==-1)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                System.out.print((index+1)+" "+(index+2)+" "+(index+3));
            }
            System.out.println();
        }
    }
}
