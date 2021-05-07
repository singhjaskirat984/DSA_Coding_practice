/*
Reverse A Number
1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.

Input Format
"n" where n is any integer.

Output Format
d1
d2
d3
... digits of the number in reverse

Sample Input
65784383

Sample Output
3
8
3
4
8
7
5
6
*/

// normal reading the digits from ones place and printing them

import java.util.*;

public class reverse_a_number {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n != 0){
            int digit = n % 10;
            n = n / 10;
            System.out.println(digit);
        }
    }
}
