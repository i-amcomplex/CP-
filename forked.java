import java.util.Scanner;

public class forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int a = sc.nextInt();
            int b=sc.nextInt();
            int xk=sc.nextInt();
            int yk=sc.nextInt();
            int xq=sc.nextInt();
            int yq=sc.nextInt();
            int count=0;
            int[][] kni={{xk+a,yk+b},{xk+a,yk-b},{xk+b,yk+a},{xk+b,yk-a},{xk-a,yk+b},{xk-a,yk-b},{xk-b,yk+a},{xk-b,yk-a}};
            int[][] qui={{xq+a,yq+b},{xq+a,yq-b},{xq+b,yq+a},{xq+b,yq-a},{xq-a,yq+b},{xq-a,yq-b},{xq-b,yq+a},{xq-b,yq-a}};
            for (int j=0;j<8;j++){
                for (int k = 0; k < 8; k++) {
                    if(kni[j][0]==qui[k][0] && kni[j][1]==qui[k][1])
                        count++;
                }
            }
            if(a==b)
                System.out.println(count/4);
            else
                System.out.println(count);
        }
    }
}
