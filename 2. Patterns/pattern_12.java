/*
Pattern 12

0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377

*/

import java.util.*;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0, b=1, sum=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1){
                    System.out.print(a + "\t");
                }else if(i==2 && j==1){
                    System.out.print(b + "\t");
                }else{
                    sum = a+b;
                    System.out.print(sum + "\t");
                    a=b;
                    b=sum;
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
