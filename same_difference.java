import java.util.Scanner;
public class same_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int count=0;
            String s=sc.next();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)!=s.charAt(n-1))
                    count++;
            }
            System.out.println(count);
        }
    }
}
