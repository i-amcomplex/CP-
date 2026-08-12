import java.io.*;
import java.util.*;
public class Double_ended_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String a = br.readLine();
            String b = br.readLine();

            int longest_sub = 0;

            // lets say outer loop co
            for (int j = 1; j <= Math.min(a.length(),b.length()); j++) {
                for (int k = 0; k + j <= a.length(); k++) {
                    for (int l = 0; l +j <= b.length(); l++) {
                        if(a.substring(k,k+j).equals( b.substring(l,l+j)))
                            longest_sub=Math.max(longest_sub,j);
                    }
                }
            }
            System.out.println(a.length()+b.length()-2*longest_sub);
        }
    }
}
