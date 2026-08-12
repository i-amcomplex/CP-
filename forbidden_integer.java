import java.util.Scanner;

public class forbidden_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if(x!=1) {
                System.out.println("YES");
                for (int j = 1; j <= n; j++) {
                    System.out.print("1 ");
                }
                System.out.println();
            }
            //x=1
            else {
                if(n%2==0 && k>=2){
                    System.out.println("YES");
                    for (int j = 1; j <n/2 ; j++) {
                        System.out.print("2 ");
                    }
                    System.out.println();
                }
                else if (n%2==0 && k<2)
                {
                    System.out.println("NO");
                }
                // done for the even case now for the odd case i have to use 2 and 3 ka combination
                else if(n%2==1 && k>=3){
                    // this the good case where i can use both 2 and 3;
                    // check so first i will print one 3 so now the number is even and i can represent it in terms of 2
                    // also verify ke my n>=3 else print no
                    if(n>=3){
                        System.out.println("YES");
                        System.out.print("3 ");
                        for (int j = 1; j <=(n-3)/2 ; j++) {
                            System.out.print("2 ");
                        }
                        System.out.println();
                    }
                    if(n<3){
                        System.out.println("NO");
                    }
                }
                else if(n%2==1 && k<3)
                    System.out.println("NO");
            }
        }
    }
}
