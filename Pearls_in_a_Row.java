import java.util.*;
import java.io.*;

public class Pearls_in_a_Row {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer in = new StringTokenizer(br.readLine());
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i]=Long.parseLong(in.nextToken());

        }
    }
}
