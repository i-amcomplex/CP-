import java.util.*;
public class Sieve_of_Erato67henes{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        long t =sc.nextLong();

        for(int i =0;i<t;i++){
            boolean one=false,sixseven=false;
            int n =sc.nextInt();
            int a[] = new int[n];
            for(int j =0;j<n;j++){
                a[j]=sc.nextInt();
                if(a[j]==1)
                    one=true;
                else if(a[j]==67)
                    sixseven=true;
            }
            if(sixseven==true && one==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}