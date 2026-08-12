import java.util.Scanner;

public class square_pool {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long s=sc.nextLong();
            int[] dx= new int[n];
            int[] dy= new int[n];
            long[] xi= new long[n];
            long[] yi= new long[n];
            for (int j = 0; j < n; j++) {
                dx[j]=sc.nextInt();
                dy[j]=sc.nextInt();
                xi[j]=sc.nextLong();
                yi[j]=sc.nextLong();
            }
            long count=0;
            for (int j = 0; j < n; j++) {
                if(xi[j]==yi[j] && dx[j]*dy[j]==1)
                    count++;
                else if(xi[j]+yi[j]==s && dx[j]*dy[j]==-1)
                    count++;
            }
            System.out.println(count);
        }
    }
}
