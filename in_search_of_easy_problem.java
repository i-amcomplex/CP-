import java.util.Scanner;

public class in_search_of_easy_problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans+=sc.nextInt();
        }
        if(ans>=1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
