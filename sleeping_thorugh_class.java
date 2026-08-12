import java.util.Scanner;
//https://codeforces.com/problemset/problem/2173/A
public class sleeping_thorugh_class {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String classes = sc.next();
            // maintain a checking variable if there is a 1 k characters behind
            int sum=0;
            // i will keep on adding the number in sum; and check if k digits behind if there is a 1
            // then skip the zero
            // else if it is 1
            int limit=-1;
            for (int j = 0; j < classes.length(); j++) {
                if(classes.charAt(j)=='1')
                {
                    limit=j+k;
                }
                else if(classes.charAt(j)=='0')
                {
                    if(j>limit)
                        sum++;

                }
            }
            System.out.println(sum);
        }
    }
}