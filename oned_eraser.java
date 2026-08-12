import java.util.Scanner;

public class oned_eraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            String s=sc.next();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='B')
                {
                    count++;
                    j+=k-1;
                }
            }
            System.out.println(count);
        }
    }
}
