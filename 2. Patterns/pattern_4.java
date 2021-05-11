/*
Pattern 4

* * * * *
  * * * *
    * * *
      * *
        *
*/

// import java.util.*;

// public class pattern_4 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         for (int i = 1; i<=n; i++) {
//             int k = i-1;
//             for (int j = 1; j<=n; j++) {
//                 if(k>0){
//                     System.out.print("\t");
//                     k--;
//                 }else{
//                     System.out.print("*\t");
//                 }
//             }
//             System.out.println();
//         }
        
//         scn.close();
//     }
// }


// This solution is also good

import java.util.*;

public class pattern_4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nspaces = 0;
        int nstars = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }

            nspaces++;
            nstars--;
            System.out.println();
        }

    }
}

