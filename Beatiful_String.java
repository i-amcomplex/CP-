import javax.swing.*;
import java.util.Scanner;

public class Beatiful_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s= sc.next().trim();
            int start = 0,end=n-1,flag=0;
            while(end>=start)
            {
                if(s.charAt(start)==s.charAt(end)){
                    start++;
                    end--;
                }
                else {
                    System.out.println(end-start+1);
                    for (int j = start+2; j <=end+1 ; j++) {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                    flag++;
                    break;
                }
            }
            if(flag==0)
                System.out.println("0");


        }
    }
}
