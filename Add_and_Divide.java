import java.io.*;
import java.util.*;
public class Add_and_Divide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            long a= Long.parseLong(in.nextToken());
            long b = Long.parseLong(in.nextToken());
            if(b>a)
            {
                System.out.println(1);
            }
            else if (b==a)
            {
                System.out.println(2);
            }
            else
            {

            }
        }
    }
}
