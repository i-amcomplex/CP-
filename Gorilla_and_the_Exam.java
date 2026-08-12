import java.util.*;
public class Gorilla_and_the_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            // need to find minimum amount of distinct elements
            // sorted
            HashMap<Long,Long> b =new HashMap<>();

            for (int j = 0; j < n; j++) {
                long c = sc.nextLong();
                if(b.containsKey(c)) {
                    b.put(c, b.get(c) + 1);
                }
                else {
                    b.put(c, 1L);
                }
            }
            // subtract till k is 0
            //
            ArrayList<Long> freqs = new ArrayList<>(b.values());
            Collections.sort(freqs);
            int l=0;
            for (int j = 0; j < freqs.size()-1; j++) {
                if(k-freqs.get(j)>=0) {
                    k -= freqs.get(j);
                    l++;
                }
                else
                    break;
            }
            System.out.println(freqs.size()-l);
        }
    }
}
