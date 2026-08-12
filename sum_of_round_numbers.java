import java.util.Scanner;

public class sum_of_round_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            if(n<10)
            {
                System.out.println(1);
                System.out.println(n);
            }
            else {
                int digits = 0;
                for (int j = 0; j < Integer.toString(n).length(); j++) {
                    if (Integer.toString(n).charAt(j) != '0')
                        digits++;
                }
                System.out.println(digits);
                for (int j = 0; j < Integer.toString(n).length(); j++) {
                    if (Integer.toString(n).charAt(j) != '0')
                        System.out.print((int)(n/Math.pow(10,Integer.toString(n).length()))*Math.pow(10,Integer.toString(n).length()));
                }
            }
        }
    }
}
