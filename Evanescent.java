import java.util.*;
import java.io.*;

public class Evanescent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int start=-1,end=-1,len=0;
            int max = 0;
            char ch = ' ';
            for (int j = 0; j < n-1; j++) {
                if(s.charAt(j)==s.charAt(j+1))
                {
                    len++;
                    if(j==n-2)
                    {
                        if(max<len)
                        {
                            max=len;
                            ch=s.charAt(j-1);
                            start=j -len+1;
                            end=n-1;
                        }
                    }
                }
                else
                {
                    if(max<len)
                    {
                        max=len;
                        ch=s.charAt(j-1);
                        start=j -len;
                        end=j-1;
                        len=1;
                    }

                }
            }
            int left_one=0,right_one=0;
            // now lets delete the left character and the right character
            for (int j = 0; j < n-1; j++) {
                if(j==start-1 && j!=0)
                    j++;
                else {
                    if (s.charAt(j) != s.charAt(j + 1) || j!=n-2) {
                        left_one++;
                    }
                }
                if(j==n-2)
                    left_one++;
            }
            for (int j = 0; j < n-1; j++) {
                if(j==end+1 && j!=0)
                    j++;
                else
                {
                    if(s.charAt(j)!=s.charAt(j+1) || j!=n-2)
                    {
                        right_one++;
                    }
                }
                if(j==n-2)
                    right_one++;
            }
            System.out.println(Math.min(right_one,left_one));
        }
    }
}
