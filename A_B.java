import java.io.*;
public class A_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            char[] s = (br.readLine().toCharArray());
            System.out.println((int) (s[0]-'0'+s[2]-'0'));
        }
    }
}
