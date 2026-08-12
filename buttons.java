import java.util.Scanner;

public class buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            int anna,katie;
            if(c%2==0) {
                anna = c / 2 + a;
            }
            else
            {
                anna= c/2 + 1 +a;
            }
            katie = c / 2 + b;
            if(anna>katie)
                System.out.println("First");
            else if (katie >= anna)
                System.out.println("Second");
        }
    }
}
