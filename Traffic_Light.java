import java.util.Scanner;

public class Traffic_Light {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            char a =sc.next().trim().charAt(0);
            String s= sc.next();
            s+=s;
            // now find the difference between the given character and g and maximize it
            // find the leftmost character before G
            // compare the difference and then maximize it
            if(a=='g')
            {
                System.out.println(0);
            }
            else {
                // find the leftmost pointer of a
                // and leftmost pointer of G
                // maintain last occurrence of green and then update the value of the index
                int last_green=-1;
                long ans=0;
                int last_char=-1;
                int temp=0;
                // leftmost r and leftmost green
                for (int j = 0; j < 2*n; j++) {
                    // find leftmost r and dont update it until we find a green
                    if(s.charAt(j)==a && temp==0)
                    {
                        last_char=j;
                        temp++;
                    }
                    else if(s.charAt(j)=='g' && temp!=0)
                    {
                        ans=Math.max(ans,Math.abs(j-last_char));
                        temp=0;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
