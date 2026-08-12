import java.util.*;
public class The_67th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int t =sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int n =sc.nextInt();
            int[] a= new int[3*n];
            for(int j =0;j<3*n;j++)
            {
                a[j]=j+1;
            }
            int[] ans = new int[3*n];
            int r=0,l=3*n-1,index=0;
            for(int j=0;j<n;j++)
            {
                ans[index]=r+1;
                index++;
                ans[index]=l;
                index++;
                ans[index]=l+1;
                index++;
                r++;
                l-=2;
            }
            for(int j =0;j<3*n;j++)
            {
                System.out.print(ans[j]+" ");
            }
            System.out.println();
        }
    }
}