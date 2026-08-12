import java.util.*;
import java.io.*;
public class Triangles_on_a_Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            long w = Long.parseLong(in1.nextToken());
            long h = Long.parseLong(in1.nextToken());

            StringTokenizer in2 = new StringTokenizer(br.readLine());
            int k2 = Integer.parseInt(in2.nextToken());
            long l1_low = Long.parseLong(in2.nextToken());
            long l1_high = 0;
            for (int j = 0; j < k2-1; j++) {
                l1_high = Long.parseLong(in2.nextToken());
            }

            StringTokenizer in3 = new StringTokenizer(br.readLine());
            int k3 = Integer.parseInt(in3.nextToken());
            long l3_low = Long.parseLong(in3.nextToken());
            long l3_high = 0;
            for (int j = 0; j < k3-1; j++) {
                l3_high = Long.parseLong(in3.nextToken());
            }

            StringTokenizer in4 = new StringTokenizer(br.readLine());
            int k4 = Integer.parseInt(in4.nextToken());
            long l4_low = Long.parseLong(in4.nextToken());
            long l4_high = 0;
            for (int j = 0; j < k4-1; j++) {
                l4_high = Long.parseLong(in4.nextToken());
            }

            StringTokenizer in5 = new StringTokenizer(br.readLine());
            int k5 = Integer.parseInt(in5.nextToken());
            long l5_low = Long.parseLong(in5.nextToken());
            long l5_high = 0;
            for (int j = 0; j < k5-1; j++) {
                l5_high = Long.parseLong(in5.nextToken());
            }

            System.out.println(Math.max(Math.max((l1_high-l1_low)*h,(l3_high-l3_low)*h),Math.max((l5_high-l5_low)*w,(l4_high-l4_low)*w)));
        }
    }
}
