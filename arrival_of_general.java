import java.util.Scanner;

public class arrival_of_general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int maxindex=0,minindex=0;
        a[0]=sc.nextInt();
        for (int i = 1; i < n; i++) {
            a[i]=sc.nextInt();
            if(a[i]>a[maxindex])
                maxindex=i;
            if(a[i]<=a[minindex])
                minindex=i;
        }
        if(maxindex<minindex)
            System.out.println(maxindex+n-1-minindex);
        else
            System.out.println(maxindex+n-1-minindex-1);
    }
}
