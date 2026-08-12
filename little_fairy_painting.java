import java.util.Arrays;
import java.util.Scanner;
//https://codeforces.com/problemset/problem/2175/A
// couldnt solve this come again to solve this problem

import java.util.*;
class little_fairy_painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int mex = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == mex) {
                    mex++;
                }
            }

            System.out.println(mex);
        }
    }
}
