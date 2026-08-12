import java.util.*;
import java.io.*;
public class Increase_and_Copy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long target = Long.parseLong(br.readLine());
            long sum = 1,add=2;
            int steps= 0;
            HashSet<Long> a = new HashSet();
            a.add(1l);
            while(sum!=target)
            {
                if(a.contains(target-sum))
                {
                    steps+=1;
                    break;
                }
                else
                {
                    sum+=add;
                    add++;
                    a.add(add);
                    steps+=2;
                }
            }
            System.out.println(steps);
        }
    }
}
