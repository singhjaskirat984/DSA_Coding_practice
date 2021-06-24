/*
Pattern 15

        1
    2   3   2
3   4   5   4   3
    2   3   2
        1

*/

import java.util.*;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = 2;
        int oval = 1;//different from *

        for(int i=1 ; i<=n; i++){

            int val = oval; //different from *

            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=stars; j++){
                System.out.print(val + "\t");//different from *
                if(j <= stars / 2){//different from *
                    val++;//different from *
                }else{//different from *
                    val--;//different from *
                }
            }

            System.out.println();//different from *

            if(i<=n/2){
                oval++;//different from *
                spaces--;
                stars+=2;
            }else{
                oval--;//different from *
                spaces++;
                stars-=2;
            }
        }
    }
    
}
