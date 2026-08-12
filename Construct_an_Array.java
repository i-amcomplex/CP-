import java.util.*;
import java.io.*;
public class Construct_an_Array {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 1; j <= 2*n ; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
