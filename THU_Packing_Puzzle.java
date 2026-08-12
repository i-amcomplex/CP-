import java.util.Scanner;

public class THU_Packing_Puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long ct=sc.nextLong();
            long ch=sc.nextLong();
            long cu=sc.nextLong();
            long count=0;
            count=Math.min(ct,Math.min(ch,cu))*7;
            ct-=count/7;
            ch-=count/7;
            cu-=count/7;
            // now at least one of them is 0
            if(ct>0)
            {
                if(ch>0)
                {

                }
                else if(cu>0)
                {

                }
                else
                {

                }
            }
        }
    }
}
