import java.util.*;
import java.io.*;

public class Array_merging {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer in = new StringTokenizer(br.readLine());
            int[] a= new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=Integer.parseInt(in.nextToken());
            }
            int[] b= new int[n];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                b[j]=Integer.parseInt(in1.nextToken());
            }
            HashMap<Integer,Integer> a_1 = new HashMap<>();
            HashMap<Integer,Integer> b_1 = new HashMap<>();
            if(n==1) {
                a_1.put(a[0], 1);
                b_1.put(b[0], 1);
            }
            // calculate the maximum subsequence

            int temp =1;
            for (int j = 0; j < n-1; j++) {
                if(a[j]==a[j+1])
                {
                    temp++;
                    if(j==n-2)
                    {
                        // check if this in the hashmap
                        if(a_1.containsKey(a[j]))
                        {
                            if(a_1.get(a[j])<temp)
                                a_1.put(a[j],temp);
                        }
                        else
                            a_1.put(a[j],temp);
                    }
                }
                else
                {
                    if(a_1.containsKey(a[j]))
                    {
                        if(a_1.get(a[j])<temp)
                            a_1.put(a[j],temp);
                    }
                    else
                        a_1.put(a[j],temp);
                    if(!a_1.containsKey(a[j+1]))
                        a_1.put(a[j+1],1);
                    temp=1;
                }
            }
            temp=1;
            for (int j = 0; j < n-1; j++) {
                if(b[j]==b[j+1])
                {
                    temp++;
                    if(j==n-2)
                    {
                        // check if this in the hashmap
                        if(b_1.containsKey(b[j]))
                        {
                            if(b_1.get(b[j])<temp)
                                b_1.put(b[j],temp);
                        }
                        else
                            b_1.put(b[j],temp);
                    }
                }
                else
                {
                    if(b_1.containsKey(b[j]))
                    {
                        if(b_1.get(b[j])<temp) {
                            b_1.put(b[j], temp);
                        }
                    }
                    else
                        b_1.put(b[j],temp);
                    if(!b_1.containsKey(b[j+1]))
                        b_1.put(b[j+1],1);

                    temp=1;
                }
            }
            ArrayList<Integer> items_A = new ArrayList<>(a_1.keySet());
            int max = 0;
            for (int j = 0; j < items_A.size(); j++) {
                if(b_1.containsKey(items_A.get(j)))
                    max = Math.max(max,b_1.get(items_A.get(j))+a_1.get(items_A.get(j)));
                else
                    max = Math.max(max,a_1.get(items_A.get(j)));
            }
            ArrayList<Integer> items_b = new ArrayList<>(b_1.keySet());
            for (int j = 0; j < items_b.size(); j++) {
                if(a_1.containsKey(items_b.get(j)))
                    max = Math.max(max,b_1.get(items_b.get(j))+a_1.get(items_b.get(j)));
                else
                    max = Math.max(max,b_1.get(items_b.get(j)));
            }
            System.out.println(max);
        }
    }
}
