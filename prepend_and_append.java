import java.util.Scanner;

public class prepend_and_append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            String s = sc.next();
            int start=0,end=n-1,check=0;
            while(end>=start){
                if(s.charAt(start)!=s.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                {
                    check++;
                    System.out.println(end-start+1);
                    break;
                }
            }
            if(check==0)
                System.out.println(0);
        }
    }
}
