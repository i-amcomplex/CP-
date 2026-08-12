import java.util.Scanner;
public class yet_another_array_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int min = 0;
            long[] a = new long[n];
            a[0]=sc.nextLong();
            for (int j = 1; j < n; j++) {
                a[j]=sc.nextLong();
                if(a[min]>a[j])
                    min=j;
            }
            long[] b={2,3,5,7,11,13,17,19,23,29,31,37,41,47,53};
            int check=0;
            for (int j = 0; j < b.length && check==0; j++) {
                for (int k = 0; k < n; k++) {
                    if(a[k]%b[j]!=0)
                    {
                        System.out.println(b[j]);
                        check++;
                        break;
                    }
                }
            }
        }
    }
}
