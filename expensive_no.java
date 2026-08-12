import java.util.Scanner;

public class expensive_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=sc.nextInt();
            Integer n1=new Integer(n);
            String s1=n1.toString();
            int count=0;
            int last_index=0;
            for (int j = s1.length()-1; j >=0; j--) {
                if(s1.charAt(j)!='0')
                {
                    last_index=j;
                    break;
                }
            }
            for (int j = 0; j <=last_index; j++) {
                if(s1.charAt(j)!='0')
                    count++;
            }
            count+=s1.length()-last_index-2;
            System.out.println(count);
        }
    }
}
