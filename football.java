import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next().trim();
        int consec=1,flag=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1))
            {
                consec++;
            }
            else {
                if(consec>=7)
                {
                    flag++;
                    break;
                }
                else
                    consec=1;
            }
            if(consec>=7)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
