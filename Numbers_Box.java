import java.io.*;
import java.util.*;
public class Numbers_Box {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int m = Integer.parseInt(in.nextToken());
            int[][] a = new int[n][m];
            int sum =0,min=Integer.MAX_VALUE;
            ArrayList<Integer> negatives = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer in1 = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    a[j][k]=Integer.parseInt(in1.nextToken());
                    if(a[j][k]<=0)
                        negatives.add(a[j][k]);
                    else {
                        sum += a[j][k];
                        min = Math.min(min, a[j][k]);
                    }
                }
            }
            if(negatives.size()%2==0)
            {
                for (int j = 0; j < negatives.size(); j++) {
                    sum+=Math.abs(negatives.get(j));
                }
            }
            else
            {
                // check if it has 0
                // so the number of negatives are even now
                if(negatives.contains(0)){
                    for (int j = 0; j < negatives.size(); j++) {
                        sum+=Math.abs(negatives.get(j));
                    }
                }
                else
                // number of negatives are odd right now with no 0
                // now i will compare which one is the smallest
                {
                    // get the smallest value and subtract it rest all ko add karo
                    negatives.sort(null);
                    // so the first one is the least negative one i can keep this one negative
                    // check if the most minimum one is less than then we will exhange it
                    if(min<Math.abs(negatives.get(negatives.size()-1)) && min>0)
                    {
                        sum+=-1*negatives.get(negatives.size()-1);
                        sum -= min;
                        negatives.remove(negatives.size()-1);
                        negatives.add(-1*min);
                    }
                    for (int j = 0; j < negatives.size()-1; j++) {
                        sum+=Math.abs(negatives.get(j));
                    }
                    sum += negatives.get(negatives.size()-1);
                }
            }
            System.out.println(sum);
        }
    }
}