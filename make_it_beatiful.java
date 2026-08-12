import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class make_it_beatiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n= sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int sum=a[0];
            int min=0,max=0;
            for (int j = 1; j <n ; j++) {
                if(a[j]>a[max])
                    max=j;
                if(a[j]<a[min])
                    min=j;
            }
            if(max==min)
                System.out.println("NO");
            else{
                System.out.println("YES");
                Arrays.sort(a);
                int temp=a[1];
                a[1]=a[0];
                a[0]=a[n-1];
                a[n-1]=temp;
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
