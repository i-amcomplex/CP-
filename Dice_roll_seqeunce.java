import java.util.*;
import java.io.*;

public class Dice_roll_seqeunce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j]=Integer.parseInt(in.nextToken());
            }
            int ans =0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j]==7-arr[j+1] || arr[j]==arr[j+1])
                {
                    ans++;
                    if(j==n-2)
                        continue;
                    else
                        arr[j+1]=val(arr,arr[j],arr[j+2]);
                }
            }
            System.out.println(ans);
        }
    }
    public static int val(int[] a,int left,int right)
    {
        for (int i = 1; i <=6; i++) {
            if(left!=i && right!=i && right!=7-i && left!=7-i)
                return i;
        }
        return -1;
    }
}
