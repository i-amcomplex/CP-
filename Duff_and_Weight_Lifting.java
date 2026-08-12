import java.util.*;
import java.io.*;

public class Duff_and_Weight_Lifting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> a = new ArrayList<>();
        StringTokenizer in = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Long.parseLong(in.nextToken()));
        }

    }
}
