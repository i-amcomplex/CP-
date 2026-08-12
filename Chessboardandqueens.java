import java.io.*;

public class Chessboardandqueens {
    static int[][] ch = new int[8][8];
    static int[] left = new int[20];
    static int[] right = new int[20];
    static int[] row = new int[8];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            String in = br.readLine();
            for (int j = 0; j < 8; j++) {
                ch[i][j]=in.charAt(j);
            }
        }
        System.out.println(solve(0));
    }
    public static int solve(int column)
    {
        if(column==8)
        {
            return 1;
        }
        int ans=0;
        for (int i = 0; i < 8; i++) {
            if(ch[i][column]!='*' && row[i]==0 && left[column+i]==0 && right[7+column-i]==0)
            {
                row[i]=1;
                left[column+i]=1;
                right[7+column-i]=1;
                ans+=solve(column+1);
                row[i]=0;
                left[column+i]=0;
                right[7+column-i]=0;
            }
        }
        return ans;
    }
}
