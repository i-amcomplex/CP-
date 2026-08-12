import java.util.Scanner;

public class unit_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            int negative=0;
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
                if(arr[j]==-1)
                    negative++;
            }
            int sum= n-2*negative;
            int prod=(int)Math.pow(-1,negative);
            if(sum>=0 && prod==1)
                System.out.println(0);
            else if(sum>=0 && prod==-1){
                System.out.println(1);
            }
            else if(sum<0 && prod==1)
            {

                int ops=0;
                while(sum<0)
                {
                    sum+=4;
                    ops+=2;
                }
                System.out.println(ops);
            }
            else
            {
                sum+=2;
                if(sum>=0)
                    System.out.println(1);
                else
                {
                    int ops=0;
                    while(sum<0)
                    {
                        sum+=4;
                        ops+=2;
                    }
                    System.out.println(ops+1);
                }
            }
        }
    }
}
