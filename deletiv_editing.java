import java.util.Scanner;

public class deletiv_editing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] s = sc.nextLine().split(" ");
            String q=s[0];
            String an=s[1];
            char[] ans=an.toCharArray();
            int a = q.lastIndexOf(ans[an.length()-1]);

            if(a==-1)
            {
                System.out.println("NO");
            }
            else
            {
                for (int j = q.length()-1; j >=0 ; j--) {

                }
            }
        }
    }
    public static int compare(char[] ans,char ch,int index){
        int re=-1;
        for (int i = index; i >=0 ; i--) {
            if(ans[i]==ch)
            {
                re=1;
                break;
            }
        }
        return re;
    }
}
