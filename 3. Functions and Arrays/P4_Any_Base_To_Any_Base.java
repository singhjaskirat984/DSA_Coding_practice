/*
Programme 4 - Any Base To Any Base  

1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.

Input Format
A number n
A base b1
A base b2

Output Format
A number of base b2 equal in value to n of base b1.

Sample Input
111001
2
3

Sample Output
2010

*/

import java.util.*;

public class P4_Any_Base_To_Any_Base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int bToD = AnyBaseToDecimal(n, b1, 10);
        int dToB = DecimalToAnyBase(bToD, 10, b2);
        System.out.println(dToB);
    }

    public static int AnyBaseToDecimal(int n, int b1, int b2) {
        int power = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + (rem * power);
            power = power * b1;
        }
        return ans;
    }

    public static int DecimalToAnyBase(int n, int b1, int b2) {
        int power = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % b2;
            n = n / b2;
            ans = ans + (rem * power);
            power = power * 10;
        }
        return ans;
    }

}
