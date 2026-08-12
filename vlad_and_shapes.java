import java.util.*;
public class vlad_and_shapes{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if(counter==0){
                    for (int j = 0; j < n; j++) {
                        if(arr[i][j]==1)
                        {
                            if(arr[i+1][j]==1 && arr[i][j+1]==1) {
                                counter++;
                                break;
                            }
                            else {
                                counter =-2;
                                break;
                            }
                        }
                    }
                }
            }
            if(counter==1)
                System.out.println("SQUARE");
            else
                System.out.println("TRIANGLE");
        }
    }
}