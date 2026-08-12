import java.util.*;
import java.io.*;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long max =0,temp=0;
        for (int i = 0; i < s.length()-1; i++) {

            if(s.charAt(i)==s.charAt(i+1))
            {
                temp++;
                if(i==s.length()-2)
                {
                    temp++;
                    max=Math.max(max,temp);
                }
            }
            else
            {
                max = Math.max(max,temp);
                temp=1;
            }
        }
        System.out.println(max);
    }
}
