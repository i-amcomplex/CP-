import java.util.Scanner;

public class multiple_constructions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a= new int[2*n];
            a[n-1]=n;
            int count=n-1;
            for (int j = 0; j <n-1 ; j++) {
                a[j]=count;
                count--;
            }
            count=1;
            for (int j = n; j <2*n ; j++) {
                a[j]=count;
                count++;
            }
            for (int j = 0; j < 2*n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
