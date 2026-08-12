import java.util.*;
public class Flip_Flops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long c=sc.nextLong();
            long k =sc.nextLong();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextLong();
            }
            Arrays.sort(a);
            for (int j = 0; j < n; j++) {
                if(a[j]>c)
                {
                    break;
                }
                else
                {
                    if(k==0)
                    {
                        c+=a[j];
                    }
                    else
                    {
                        if(c==k+a[j])
                        {
                            c+=c;
                            k=0;
                        }
                        else if (c>k+a[j])
                        {
                            c+=k+a[j];
                            k=0;
                        }
                        else
                        {
                            k=k-(c-a[j]);
                            c+=c;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}
