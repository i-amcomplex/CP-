import java.util.Scanner;

public class mathy_sequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            int limit=3,printing=2;
            String s="";
            for (int j = 0; j < a; j++) {
                if(j%2==0)
                {
                    s+="1 ";
                }
                else
                {
                    if(limit==printing||(limit-1==printing && limit!=3) )
                    {
                        s+=(limit)+" ";
                        limit++;
                        printing=2;
                    }
                    else
                    {
                        s+=printing+" ";
                        printing++;
                    }
                }
            }
            System.out.println(s);
        }
    }
}