import java.util.Scanner;

public class extremely_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            Integer n1= new Integer(n);
            String s=n1.toString();
                int count=0;
                count+=(s.length()-1)*9+n/(int)Math.pow(10,s.length()-1);
                System.out.println(count);
        }
    }
}
