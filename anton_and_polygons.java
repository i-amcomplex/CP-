import java.util.Scanner;

public class anton_and_polygons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t= sc.nextLong();
        long ans=0;
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if(s.charAt(0)=='I')
                ans+=20;
            else if(s.charAt(0)=='C')
                ans+=6;
            else if(s.charAt(0)=='T')
                ans+=4;
            else if(s.charAt(0)=='O')
                ans+=8;
            else
                ans+=12;
        }
        System.out.println(ans);
    }
}
