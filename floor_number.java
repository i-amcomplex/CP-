import java.util.Scanner;

public class floor_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int x = sc.nextInt();
            int floor=0;
            while (floor*x+2 <n)
            {
                floor++;
            }
            System.out.println(floor+1);
        }
    }
}
