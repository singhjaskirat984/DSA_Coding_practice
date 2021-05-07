/*
Pattern 2

* * * * *
* * * *
* * *
* * 
* 

*/

import java.util.*;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        
        // for (int i = n; i>=1; i--) {
        //     for (int j = i; j>=1; j--) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }
        
        scn.close();
    }
}
