import java.util.*;
import java.io.*;

public class Swap_Adjacent_Elements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer in = new StringTokenizer(br.readLine());
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(in.nextToken());
        }
        // what i will do is ke
        // whenever there is a continuos subsequence i will always sort it
        // whenerver there is single loner zero then i will check if i+1 is greater or not

        StringTokenizer in2 = new StringTokenizer(br.readLine());
        int[] b= new int[n-1];
        for (int i = 0; i < n-1; i++) {
            b[i]=Integer.parseInt(in2.nextToken());
        }
        // now check the subsequence
        int min=a[0];
        for (int i = 0; i < n-2; i++) {
            if(b[i]==1 && b[i+1]==1)
            {
                min=Math.max(a[i],Math.max(a[i+1],min));
            }
            // if agar there is only a single one
            if(b[i]==1)
            {
                min=Math.min(min,Math.max(a[i],a[i+1]));
            }
        }
    }
}
