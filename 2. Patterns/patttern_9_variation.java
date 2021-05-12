/*
Pattern 9 variation

*               *               *
        *               *
*               *               *
        *               *
*               *               *

*/

import java.util.*;

public class patttern_9_variation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j == n+1 || i==j || j-i==2 || i-j==2){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
