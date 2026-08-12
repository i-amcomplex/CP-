import java.util.*;
import java.io.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num=0;
        StringTokenizer in = new StringTokenizer(br.readLine());
        for (int i = 1; i <=n-1; i++) {
            num=num^Integer.parseInt(in.nextToken())^i;
        }
        num=num^n;
        System.out.println(num);
    }
}
