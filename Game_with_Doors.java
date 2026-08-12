import java.util.Scanner;
public class Game_with_Doors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            int x = Math.min(r1,r2)-Math.max(l1,l2)+1;
            int ans=x-1;
            if(x<=0)
                System.out.println("1");
            else
            {
                if(l1!=l2)
                {
                      ans+=1;
                }
                if(r1!=r2)
                {
                    ans+=1;
                }
                System.out.println(ans);
            }
        }
    }
}