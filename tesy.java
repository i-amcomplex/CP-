import java.util.*;
public class tesy {
    public static void main(String[] args) {
        String s="";
        boolean ascending = true;
        for(int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i)>s.charAt(i+1) && s.charAt(i)!=0 && s.charAt(i+1)!=0)
            {
                ascending=false;
                break;
            }
        }
        if(ascending)
        {
            System.out.println(-1);
        }
        else
        {
            for(int i = s.length()-1;i>=0;i--)
            {

            }
        }
    }
}