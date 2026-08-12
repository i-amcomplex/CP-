import java.util.*;
import java.io.*;

public class Box_fitting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            long w = Long.parseLong(in.nextToken());
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            ArrayList<Long> width = new ArrayList<>();
            // now lets check w
            Collections.sort(width);
            // now i Have to check if i can put it in the
            int index = width.size()-1;
            long temp =w;
            long ans = 1;
            int count = 0;
            while(index>=count)
            {
                if(w-width.get(index)>=0) {
                    w -= width.get(index);
                }
                else
                {
                    if(w- width.get(count)>=0) {
                        w -= width.get(count);
                        count++;
                    }
                    else {
                        w=temp-width.get(index);
                        ans++;
                    }
                }
                index--;
            }
            // now i will have the width left
            // extra space stored in w
            System.out.println(ans);
        }
    }
}
