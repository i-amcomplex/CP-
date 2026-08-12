import java.util.Scanner;

public class Cover_in_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            int consecutive_check=0;
            int flag=0;
            for (int j = 0; j < n-1; j++) {
                if (consecutive_check>=2) {
                    flag++;
                    break;
                }
                if(s.charAt(j)=='.' && s.charAt(j+1)=='.')
                    consecutive_check++;
                else if (s.charAt(j)=='.' && s.charAt(j+1)=='#')
                {
                    consecutive_check=0;
                }
            }
            if(consecutive_check>=2)
                flag++;
            if(flag>0)
                System.out.println("2");
            else
            {
                int count=0;
                for (int j = 0; j < n; j++) {
                    if(s.charAt(j)=='.')
                        count++;
                }
                System.out.println(count);
            }
        }
    }
}
