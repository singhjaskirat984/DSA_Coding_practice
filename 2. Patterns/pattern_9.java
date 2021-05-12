/*
Pattern 9 - amalmagation of 7 and 8

*               *
    *       *   
        *          
    *      *
*               *    

Spliiting pattern into two lines

*                                            [i==j as i=1 and j=1]
    *                                        [i==j as i=2 and j=2]
        *                                    [i==j as i=3 and j=3]
            *                                [i==j as i=4 and j=4]
                *                            [i==j as i=5 and j=5]


                *                            [i+j == n+1 as i=1,j=5 and n=5 result=6]
            *                                [i+j == n+1 as i=2,j=4 and n=5 result=6]
        *                                    [i+j == n+1 as i=3,j=3 and n=5 result=6]
    *                                        [i+j == n+1 as i=4,j=2 and n=5 result=6]
*                                            [i+j == n+1 as i=5,j=1 and n=5 result=6]

*/

import java.util.*;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j == n+1 || i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

/*

first approach we thought of was using stars and spaces

for(int i=1; i<=n; i++){

            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }

            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }

            if(i <= n/2){
                spaces += 2;
                stars--;
            }else{
                spaces -= 2;
                stars++;
            }

            System.out.println();
        }

but too much distortion in pattern was there as in i=1 4 spaces
i=2 first space then star, then 2 space then star, then one space then star
too much distortion 
so we think of pritning only *
find positions which only have * see their pattern and print there
else print space

*/