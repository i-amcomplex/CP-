import java.util.Scanner;

public class ambitious_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Math.abs(sc.nextInt());
        }
        int min=0;
        for (int i = 1; i <n ; i++) {
            if(a[min]>a[i])
                min=i;
        }
        System.out.println(a[min]);
    }
}
