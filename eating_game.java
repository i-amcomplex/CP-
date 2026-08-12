import java.util.Scanner;

public class eating_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            int max=0,maxcounter=1;
            a[0]=sc.nextInt();
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextInt();
                if(a[max]<a[j])
                {
                    maxcounter=1;
                    max=j;
                }
                else if(a[max]==a[j])
                {
                    maxcounter++;
                }
            }
            System.out.println(maxcounter);
        }
    }
}
