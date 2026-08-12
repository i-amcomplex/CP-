import java.util.Scanner;

public class ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int count1=a[0],count2=a[0],count=0,temp=0;
            for (int j = 0; j < n; j++) {
                if(a[j]==count1)
                    count++;
                else if(a[j]!=count1){
                    count2++;
                    temp++;
                }
            }
            if(temp>1)
                System.out.println("NO");
            else if(n%2==0 && count==n/2 && count==count2)
            {
                System.out.println("YES");
            }
            else if(n%2==1 && ((count==n/2 && count2==n-n/2)||(count==n-n/2 && count2==n/2)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
