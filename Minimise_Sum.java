import javax.xml.transform.Source;
import java.util.Scanner;

public class Minimise_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int n =sc.nextInt();
            int[] a = new int[n];
            a[0]=sc.nextInt();
            int min=0;
            int sum=a[0];
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextInt();
            }
            System.out.println((int) (Math.min(a[0],a[1]))+a[0]);
        }
    }
}
