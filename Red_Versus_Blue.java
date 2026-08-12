import java.io.*;
import java.util.*;
public class Red_Versus_Blue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in1.nextToken());
            int r = Integer.parseInt(in1.nextToken());
            int b = Integer.parseInt(in1.nextToken());
            StringBuilder ans = new StringBuilder();
            int number_in_each_partition = r/(b+1);
            // so now r%(b+1) reds are left which i need to put in each block /partition
            // so after each number_in_ech_partition i have to
            // so put in each partition and then check if left out are non zero then add one of them as well
            int index =0;

            System.out.println(ans);
        }
    }
}
