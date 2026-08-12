import java.util.*;
import java.io.*;

public class Lecture_sleep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(in.nextToken());
        int k = Integer.parseInt(in.nextToken());
        int max = 0 , start = -1;
        StringTokenizer in1 = new StringTokenizer(br.readLine());
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(in1.nextToken());
        }
        StringTokenizer in2 = new StringTokenizer(br.readLine());
        int[] b= new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=Integer.parseInt(in2.nextToken());
        }
        // let us take the first occurence of 0
        for (int i = 0; i < n-k; i++) {
            if(b[i]==0) {
                start = i;
                break;
            }
        }
        if(start==-1)
        {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=a[i];
            }
            System.out.println(sum);
        }
        else
        {
            int window = 0;
            for (int i = start; i <n && i<start+k ; i++) {
                if(b[i]==0)
                    window+=a[i];
            }
            int left = start;
            max = window;
            for (int i = start+k; i < n; i++) {
                if(b[i]==0)
                {
                    window+=a[i];
                }
                if(b[left]==0)
                    window-=a[left];
                max = Math.max(max,window);
                left++;
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if(b[i]==1)
                    sum+=a[i];
            }
            System.out.println(sum+max);
        }
    }
}
