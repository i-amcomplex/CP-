import java.util.Scanner;

public class target_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[][] points = {{1,1,1,1,1,1,1,1,1,1},{1,2,2,2,2,2,2,2,2,1},{1,2,3,3,3,3,3,3,2,1},{1,2,3,4,4,4,4,3,2,1},{1,2,3,4,5,5,4,3,2,1}};
        for (int i = 1; i <=t ; i++) {
            String[] a = new String[10];
            for (int j = 0; j < 10; j++) {
                a[j]=sc.next();
            }
            int count=0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 10; k++) {
                    if(a[j].charAt(k)=='X')
                        count+=points[j][k];
                }
            }
            for (int j = 5; j <10 ; j++) {
                for (int k = 0; k < 10; k++) {
                    if(a[j].charAt(k)=='X')
                        count+=points[9-j][k];
                }
            }
            System.out.println(count);
        }
    }
}
