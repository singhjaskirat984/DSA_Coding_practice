/*
Pattern 16

1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	

*/

import java.util.*;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1;
        int spaces = (2*n)-3;
        int val=1;
        
        for(int i=1; i<=n; i++){

            for(int j=1; j<=stars; j++){
                System.out.print(val + "\t");
                val++;
            }

            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }

            if(i==n){
                stars--;
                for(int j=1; j<=stars; j++){
                    if(j==1){
                        val-=2;
                    }else{
                        val--;
                    }
                    System.out.print(val + "\t");
                }
            }else{
                for(int j=1; j<=stars; j++){
                    val--;
                    System.out.print(val + "\t");
                }
            }

            System.out.println();

            stars++;
            spaces-=2;

            
        }
    }
}
