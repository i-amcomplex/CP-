import java.util.ArrayList;
import java.util.Scanner;

public class seqeunce_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            //Math.min(arr[j],arr[j+1])-1 we add at j-1
            // so we can keep om going until we have 1
            ArrayList<Integer> a = new ArrayList<>();
            a.add(arr[0]);
            for (int j = 0; j < n-1; j++) {
                if(arr[j+1]>=arr[j])
                    a.add(arr[j+1]);
                else if(arr[j+1]<arr[j])
                {
                    a.add(arr[j+1]);
                    a.add(arr[j+1]);
                }
            }
            System.out.println(a.toArray().length);
            for (int j = 0; j < a.toArray().length; j++) {
                System.out.print(a.get(j)+" ");
            }
            System.out.println();
        }
    }
}
