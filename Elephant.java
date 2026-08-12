import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        if(a%5==0)
            System.out.println(a/5);
        else
            System.out.println((a/5)+1);
    }
}
