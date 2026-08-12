import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Card_Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            // 4 diff permutations
            // a1 b1   a1 b2
            int ans_a1=0;
            if(a1>b1 && a2>b2)
                ans_a1++;
            if(a1>b2 && a2>b1)
                ans_a1++;
            if(a2>b1 && a1>b2)
                ans_a1++;
            if(a2>b2 && a1>b1)
                ans_a1++;
            // a1 b1
            // a2 b2
            System.out.println(ans_a1);
            // a1 b2
            // a2 b1

            // a2 b1
            // a1 b2

            // a2 b2
            // a1 b1

        }
    }
}
