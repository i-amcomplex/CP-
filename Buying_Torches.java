import java.util.Scanner;

public class Buying_Torches {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k= sc.nextLong();
            long sticks=1;
            long count=k;
            // so now i have only 1 stick
            // i want to craft k sticks
            // so i can exchange y sticks for 1 coal
            // so i need y*k sticks for k coals
            // plus the excess sticks which are k-x
            // so i need to get >k * y for just the coal
            // 1 x x-1+x 2x-1 3x-2 4x-3 5x-4 and so on
            if((k*y+k-1)%(x-1)==0)
                count+=(k*y+k-1)/(x-1);
            else
                count+=(k*y+k-1)/(x-1)+1;
            System.out.println(count);
        }
    }
}
