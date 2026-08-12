import java.io.*;
import java.util.*;
public class Anton_and_Danik {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='A')
                count++;
            else
                count = count-1;
        }
        if(count>0)
            System.out.println("Anton");
        else if (count<0) {
            System.out.println("Danik");
        }
        else
        {
            System.out.println("Friendship");
        }
    }
}
