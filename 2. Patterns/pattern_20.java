/*
Pattern 20

n=5

*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	

n=7

*                       *
*                       *
*                       *
*           *           *
*       *       *       *
*   *               *   *
*                       *

*/

import java.util.*;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i<=n/2){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(i<n){
                    if(j==i || i+j==n+1 || j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else{
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
