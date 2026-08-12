import java.util.Scanner;
public class maximum_cost_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int[] a= new int[n];
            int zero=0,index=-1,sum=0;
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
                if(a[j]==0) {
                    zero++;
                    index = j;
                }
                sum+=a[j];
            }
            // more than 1 zero case
            if (zero>1)
            {
                int start=0,end=n-1,s=-1,e=-1;
                while(end>=start){
                    if((a[start]==0 || a[start]!=start+1) && s==-1)
                    {
                        s=start;
                    }
                    else
                        start++;
                    if((a[end]==0 || a[end]!=end+1) && e==-1)
                    {
                        e=end;
                    }
                    else
                        end--;
                }
                System.out.println(e-s+1);
            }
            // 1 or 0 zero case find the index which is out of place and not a zero
            else
            {
                int start=0,end=n-1,s=-1,e=-1;
                if(index!=-1)
                    a[index]=(n*(n+1))/2-sum;
                while(end>=start){
                    if((a[start]!=0 && a[start]!=start+1) && s==-1)
                    {
                        s=start;
                    }
                    else
                        start++;
                    if((a[end]!=0 && a[end]!=end+1) && e==-1)
                    {
                        e=end;
                    }
                    else
                        end--;
                }
                if(s==-1 && e==-1)
                    System.out.println(0);
                else
                    System.out.println(e-s+1);
            }
        }
    }
}
