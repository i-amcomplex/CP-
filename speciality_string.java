import java.util.Scanner;

public class speciality_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            String s = sc.next();
            String ans="";
            for (int j = 0; j < n; j++) {
                if(j!=n-1 && s.charAt(j)==s.charAt(j+1)) {
                    ans += "**";
                    j++;
                }
                else
                    ans+=s.charAt(j)+"";
            }
            if(n%2==1)
                System.out.println("NO");
            else
            {
                String s1=ans.substring(n/2);
                String s2=ans.substring(0,n/2);
                int check=0,an=0;
                for (int j = 0; j < n/2; j++) {
                    if(s1.charAt(j)!=s2.charAt(j))
                    {
                        an++;
                    }
                }
                if(s1.contains("*") && s2.contains("*"))
                    check++;
                if(an==0 && check>0)
                    System.out.println("YES");
                //case 2

            }
        }
    }
}
