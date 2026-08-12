import java.util.Scanner;

public class NIT_destroys_the_universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            int counter=0,consec=0;
            for (int j = 0; j < n; j++) {
                if(a[j]!=0)
                {
                    consec++;
                }
                else
                {
                    if(consec!=0)
                        counter++;
                    consec=0;
                }
            }
            if(consec!=0)
                counter++;
            if(counter==0|| counter==1||counter==2)
                System.out.println(counter);
            else
                System.out.println("2");
        }
    }
}
