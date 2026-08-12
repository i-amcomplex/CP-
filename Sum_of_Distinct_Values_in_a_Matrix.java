import java.util.*;
import java.io.*;

public class Sum_of_Distinct_Values_in_a_Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(in.nextToken());
            int m = Integer.parseInt(in.nextToken());
            int x = Integer.parseInt(in.nextToken());
            int y = Integer.parseInt(in.nextToken());
            int[] a= new int[x];
            StringTokenizer in1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                a[j] = Integer.parseInt(in1.nextToken());
            }
            int[] b= new int[y];
            StringTokenizer in2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                b[j]=Integer.parseInt(in2.nextToken());
            }
            // I have taken the inputs
            HashSet<Integer> set = new HashSet<>();
            // so now i Have 2 conditions when either a ka last element is zero
            // or b ka last element is greater
            // if it is equal doesnt matter
            // for each array i will need 2 variables
            // one of them will be to check if it is greater than 0
            // other one will be to check wether it is smaller than the number of rows/columns
            // and i will greedily add either the column or the row
            // the preference will be given to the one which has the greater value
            // then I will greedily do the opperations
            // coz either it will have all columns
            // this case will be when all the sum is less than the sum of the array of a
            int pointer1=x-1,elements_a_used=0,no_of_a=0;
            int pointer2=y-1,elements_b_used=0,no_of_b=0;
            long sum =0;
            // now lets decide which one will have the priority
            if(a[pointer1]>b[pointer2])
            {
                // so i will have all x rows and y-1 columns for me to greedily add into
                // now lets add
                // what will be the conditions
                // lets take the case when i only have used the b array
                // so for that i will have to use and operation
                //
                for (;(elements_a_used<n && no_of_a<x-1) && (elements_b_used<m && no_of_b<y) ; ) {
                    if(pointer1>0 && pointer2>0 && a[pointer1]>b[pointer2])
                    {
                        if(set.contains(a[pointer1]))
                        {
                            no_of_a++;
                            continue;
                        }
                        set.add(a[pointer1]);
                        sum+=a[pointer1];
                        pointer1--;
                        no_of_a++;
                        elements_a_used++;
                    }
                    else if(pointer2>0)
                    {
                        if(set.contains(b[pointer2]))
                        {
                            no_of_b++;
                            continue;
                        }
                        set.add(b[pointer2]);
                        sum+=b[pointer2];
                        pointer2--;
                        no_of_b++;
                        elements_b_used++;
                    }
                    else if(pointer1>0)
                    {
                        if(set.contains(a[pointer1]))
                        {
                            no_of_a++;
                            continue;
                        }
                        set.add(a[pointer1]);
                        sum+=a[pointer1];
                        pointer1--;
                        no_of_a++;
                        elements_a_used++;
                    }
                    else
                        break;
                }
                System.out.println(sum);
            }
            else
            {
                for (;(elements_a_used<n && no_of_a<x) && (elements_b_used<m && no_of_b<y-1) ; ) {
                    if(pointer1>0 && pointer2>0 && a[pointer1]>b[pointer2])
                    {
                        if(set.contains(a[pointer1]))
                        {
                            no_of_a++;
                            continue;
                        }
                        sum+=a[pointer1];
                        pointer1--;
                        no_of_a++;
                        set.add(a[pointer1]);
                        elements_a_used++;
                    }
                    else if(pointer2>0)
                    {
                        if(set.contains(b[pointer2]))
                        {
                            no_of_b++;
                            continue;
                        }
                        sum+=b[pointer2];
                        pointer2--;
                        no_of_b++;
                        set.add(b[pointer2]);
                        elements_b_used++;
                    } else if (pointer1>0) {
                        if(set.contains(a[pointer1]))
                        {
                            no_of_a++;
                            continue;
                        }
                        sum+=a[pointer1];
                        pointer1--;
                        no_of_a++;
                        set.add(a[pointer1]);
                        elements_a_used++;
                    }
                    else
                        break;
                }
                System.out.println(sum);
            }
        }
    }
}
