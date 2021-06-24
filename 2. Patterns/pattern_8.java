/*
Pattern 8

                    *
                *
            *
        *
    *
*        

*/

import java.util.*;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
