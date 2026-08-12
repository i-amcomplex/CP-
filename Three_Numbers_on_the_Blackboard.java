import java.util.*;
import java.io.*;

public class Three_Numbers_on_the_Blackboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int[] a= new int[3];
            a[0]=Integer.parseInt(in.nextToken());
            a[1]=Integer.parseInt(in.nextToken());
            a[2]=Integer.parseInt(in.nextToken());
            Arrays.sort(a);
            System.out.println(Math.min(a[2]-a[0],a[1]));
        }
    }
}
