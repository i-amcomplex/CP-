import java.util.Scanner;

public class Simons_and_Making_It_Beautiful {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt(),index=0;
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                if(a[j]==n)
                    index=j;
            }
            int temp=a[0];
            a[0]=a[index];
            a[index]=temp;
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
