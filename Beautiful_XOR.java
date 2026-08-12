import java.util.Scanner;

public class Beautiful_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(b>a)
            {
                System.out.println(-1);
            }
            else if(b==a)
            {
                System.out.println(0);
            }
            // 000100100100
            // 100100101001
            else
            {
                StringBuilder a1 = new StringBuilder();
                String a_s = Long.toBinaryString(a);
                String b_s = Long.toBinaryString(b);
                long count=0;
                // first operate till both are the same length
                if(a_s.length()>b_s.length())
                {
                    for (int j = 0; j < a_s.length()-b_s.length(); j++) {
                        if(a_s.charAt(j)=='1')
                        {
                            long an = (long) Math.pow(2, a_s.length()-j-1 );
                            a1.append(an + " ");
                            count++;
                        }
                    }
                }

                for(int j = b_s.length()-1;j>=0;j--)
                {
                    {
                        if(a_s.charAt(j+a_s.length()-b_s.length()) != b_s.charAt(j)) {
                            long an = (long) Math.pow(2, j );
                            a1.append(an + " ");
                            count++;
                        }
                    }
                }
                System.out.println(count);
                System.out.println(a1);
            }
        }
    }
}
