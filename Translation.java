import java.io.*;
import java.util.*;
public class Translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int n = b.length()-1;
        boolean ans = true;
        if(a.length()!=b.length())
            ans=false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(n)) {
                    ans = false;
                    break;
                }
                n--;
            }
        }
        if(ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}