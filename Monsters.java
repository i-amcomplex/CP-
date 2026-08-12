import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long k =sc.nextInt();
            ArrayList<long[]> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                b.add(new long[]{j+1,sc.nextLong()%k});
            }
            for (int j = 0; j < n; j++) {

            }
        }
    }
}