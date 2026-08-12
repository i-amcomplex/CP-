import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt(),count=0;
        for (int i = 0; i < t; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            if(a+b+c>=2)
                count++;
        }
        System.out.println(count);
    }
}
