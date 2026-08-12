import java.util.Scanner;

public class ideal_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int k=sc.nextInt();
            if(k==1)
                System.out.println("YES");
            else if(k%2==0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
