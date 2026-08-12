import java.io.*;
import java.util.*;
public class Beautiful_Array_2041_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(in1.nextToken());
        int b = Integer.parseInt(in1.nextToken());
        if (a==b)
        {
            System.out.println("1");
            System.out.println(a);
        }
        else
        {
            System.out.println("3");
            if(b*a>=0)
            {
                System.out.println("-"+b+" "+b+" "+(3*a));
            }
        }
    }
}
