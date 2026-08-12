import java.util.Scanner;
public class even_modulo_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int a[]= new int[n];
            int flag=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            for (int j = n-1; j >=1 ; j--) {
                for (int k = 0; k < j; k++) {
                    if((a[j]%a[k])%2==0 && flag==0)
                    {
                        System.out.println(a[k]+" "+a[j]);
                        flag++;
                    }
                }
            }
            if(flag==0)
                System.out.println(-1);
        }
    }
}
