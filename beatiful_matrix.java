import java.util.Scanner;

public class beatiful_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=sc.nextInt();
                if(a[i][j]==1)
                {
                    ans+=Math.abs(j-2)+Math.abs(i-2);
                }
            }
        }
        System.out.println(ans);
    }
}
