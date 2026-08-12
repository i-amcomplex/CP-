import java.util.*;
import java.io.*;

public class You_Delete_I_Delete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s= br.readLine();
            int firz=-1,firo=-1;
            for (int j = 0; j <s.length(); j++) {
                if(s.charAt(j)=='0' && firz!=0)
                {
                    firz++;
                }
                else if(s.charAt(j)=='0')
                {
                    System.out.print("0");
                } else if (s.charAt(j)=='1' && firo!=0) {
                    firo++;
                }
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
