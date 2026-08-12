import java.util.Scanner;

public class grasshoper_on_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(x%k!=0)
            {
                System.out.println(1);
                System.out.println(x);
            }
            if(x%k==0){
                System.out.println(2);
                System.out.println("1"+" "+(x-1));
            }
        }
    }
}
