import java.util.Scanner;

public class comparison_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            String s =sc.next().trim();
            int consec=1,a=1;
            char compare=s.charAt(0);
            for (int j = 1; j < n; j++) {
                if(compare==s.charAt(j))
                    a++;
                else
                {
                    consec=Math.max(a,consec);
                    a=1;
                    compare=s.charAt(j);
                }
            }
            consec=Math.max(a,consec);
            System.out.println(consec+1);
        }
    }
}
