import java.util.Scanner;
public class Mainak_and_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            a[0]=sc.nextInt();
            int diff=0,min=0,max=0;
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextInt();
                diff=Math.max(a[j-1]-a[j],diff);
                if(a[min]>a[j])
                    min=j;
                if(a[max]<a[j])
                    max=j;
            }
            diff=Math.max(diff,a[n-1]-a[0]);
            if(max==n-1||min==0||min-max==1)
            {
                System.out.println(a[max]-a[min]);
            }
            else
            {
                diff=Math.max(a[max]-a[0],Math.max(a[n-1]-a[min],diff));
                System.out.println(diff);
            }
        }
    }
}
