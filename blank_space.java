import java.util.Scanner;

public class blank_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int chain=0,seq=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==0)
                    seq++;
                if(arr[j]==1)
                {
                    chain=Math.max(chain,seq);
                    seq=0;
                }
            }
            chain=Math.max(seq,chain);
            System.out.println(chain);
        }
    }
}
