import java.util.Scanner;

public class Mirror_Check_Failed {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s= sc.next().trim();
            int start=0,end=s.length()-1,flag=0;
            int distinct=0;
            while(end>=start)
            {
                if(s.charAt(end)!=s.charAt(start)) {
                    flag++;
                    break;
                }
            }
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(0)!=s.charAt(j))
                {
                    distinct++;
                    break;
                }
            }

        }
    }
}
