import java.util.Scanner;

public class chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s = sc.next();
            int odd_freq=0;
            int[] ch = new int[26];
            for (int j = 0; j < n; j++) {
                ch[(int)(s.charAt(j)-'a')]++;
            }
            for (int j = 0; j < 26; j++) {
                if(ch[j]%2==1)
                    odd_freq++;
            }
            if(odd_freq>k+1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
