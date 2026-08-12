import java.util.ArrayList;
import java.util.Scanner;
public class PushingBalls {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int m =sc.nextInt();
            ArrayList<Integer> row= new ArrayList<>();
            ArrayList<Integer> col= new ArrayList<>();
            int[][] a= new int[n][m];
            int count=0;
            for (int j = 0; j < n; j++) {
                String s =sc.next().trim();
                for (int k = 0; k < m; k++) {
                    a[j][k]=(int)(s.charAt(k)-'0');
                    if(a[j][k]==1){
                        row.add(count,j);
                        col.add(count,k);
                        count++;
                    }
                }
            }
            int flag=0;
            for (int j = 0; j < row.size(); j++) {
                int check=0;
                check+=colcheck(a,row.get(j),col.get(j))+rowcheck(a,row.get(j),col.get(j));
                if(check>1)
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    public static int colcheck(int[][] b,int row,int col){
        int flag=0;
        for (int i = 0; i < row; i++) {
            if(b[i][col]!=1)
            {
                flag++;
                break;
            }
        }
        return flag;
    }
    public static int rowcheck(int[][] b,int row,int col){
        int flag=0;
        for (int i = 0; i < col; i++) {
            if(b[row][i]!=1)
            {
                flag++;
                break;
            }
        }
        return flag;
    }
}
