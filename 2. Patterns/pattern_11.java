/*
Pattern 11

1
2   3
4   5   6
7   8   9   10
11  12  13  14  15

*/

import java.util.*;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k + "\t");
                k++;
            }
            System.out.println();
        }
        scn.close();
    }
}
