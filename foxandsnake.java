import java.util.Scanner;

public class foxandsnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        String s="",s1="",s2="";
        for (int i = 0; i < m; i++) {
            s+="#";
            if(i==0)
                s1+="#";
            else
                s1+=".";
            if(i==m-1)
                s2+="#";
            else
                s2+=".";
        }
        int counter=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                System.out.println(s);
            else if (counter%2==0)
            {
                System.out.println(s2);
                counter++;
            }
            else if (counter%2==1)
            {
                System.out.println(s1);
                counter++;
            }
        }
    }
}
