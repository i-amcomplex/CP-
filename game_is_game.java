import java.util.HashMap;
import java.util.Scanner;

public class game_is_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            HashMap<Long,Integer> a1 = new HashMap<>();
            int n =sc.nextInt();
            for (int j = 0; j < n; j++) {
                long a =sc.nextLong();
                if(a1.containsKey(a))
                {
                    a1.put(a,a1.get(a)+1);
                }
                else
                    a1.put(a,1);
            }

        }
    }
}
