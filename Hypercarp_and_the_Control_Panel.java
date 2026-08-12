import java.util.*;
import java.io.*;

public class Hypercarp_and_the_Control_Panel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> a= new ArrayList<>();
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a.add(Integer.parseInt(in.nextToken()));
            }
            // I will have to check the number of consecutive

        }
    }
}
