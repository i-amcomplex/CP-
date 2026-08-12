import java.util.Scanner;

public class omkar_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            String s = sc.next();
            int freq=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='A')
                    freq++;
                else
                    freq--;

            }
            if(freq>0)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}
