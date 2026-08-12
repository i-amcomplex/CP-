import java.util.Scanner;

public class even_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            int counteven=0,countodd=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                if(j%2!=a[j]%2)
                {
                    if(j%2==0)
                        counteven++;
                    else
                        countodd++;
                }
            }
            if (countodd==counteven)
                System.out.println(countodd);
            else
                System.out.println("-1");
        }
    }
}
