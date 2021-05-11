/*
Pattern 4

* * * * *
  * * * *
    * * *
      * *
        *
*/

import java.util.*;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i<=n; i++) {
            int k = i-1;
            for (int j = 1; j<=n; j++) {
                if(k>0){
                    System.out.print("\t");
                    k--;
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        
        scn.close();
    }
}
