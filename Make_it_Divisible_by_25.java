import java.util.Scanner;

public class Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            long c0=0,c2=0,c5=0,c7=0;
            // check for 00
            // check for 25
            // check for 50
            // check for 75
            int five=0,zero=0;
            for (int j = a.length()-1; j >=0 ; j--) {
                if(a.charAt(j)=='0'){
                    continue;
                }
                else
                {
                    c0++;
                }
            }
            System.out.println();
        }
    }
}
