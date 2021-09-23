/*
Programme 3 - Any Base To Decimal  

1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.

Input Format
A number n
A base b

Output Format
A decimal number representing corresponding value of n in base b.

Sample Input
111001
2
Sample Output
57

*/

import java.util.*;

public class P3_Any_Base_To_Decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int power=1;
        int ans=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            ans = ans + (rem * power);
            power = power*b;
        }
        return ans;
    }
}
