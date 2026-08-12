import java.util.HashMap;
import java.util.Scanner;

public class Array_and_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] p = new int[n];
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                p[j]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            HashMap<Integer,Integer> b = new HashMap<>();
            for (int j = 0; j < n; j++) {
                b.put(p[j],j);
            }
            int[] ans = new int[n];
            for (int j = 0; j < n; j++) {
                ans[j]=b.get(a[j]);
            }
            boolean bool = true;
            for (int j = 0; j < n-1; j++) {
                if(ans[j]>ans[j+1])
                {
                    bool=false;
                    break;
                }
            }
            if(bool)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
