/*
Pattern 10

        *
    *       *
*               *
    *       *
        *

*/

// jugaad
import java.util.*;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i-j==2 || j-i==2 || i+j==n-1 || i+j==n+3){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}

// main implementation
