/*
Pattern 15

		*	
		*	*	
*	*	*	*	*	
		*	*	
		*

*/

import java.util.*;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = 2;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=spaces; j++){
                if(i == n/2 + 1){//at 3 row no spaces to print print * that is what is different in this pattern from diamond
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                stars++;
            }else{
                stars--;
            }

            System.out.println();
        }

    }
}
