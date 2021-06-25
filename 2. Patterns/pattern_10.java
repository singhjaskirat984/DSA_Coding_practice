/*
Pattern 10

        *
    *       *
*               *
    *       *
        *

step 1: make whole diamond
    *
  * * *
* * * * *
  * * *
    *   
step 2: remove unwanted stars

*/

import java.util.*;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nos = n / 2;
        int nis = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nos; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= nis; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                nos--;
                nis += 2;
            } else {
                nos++;
                nis -= 2;
            }

            System.out.println();
        }
    }

}

// my approach 1/5 test cases failed

// public class pattern_10 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i - j == 2 || j - i == 2 || i + j == n - 1 || i + j == n + 3) {
//                     System.out.print("*\t");
//                 } else {
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }
