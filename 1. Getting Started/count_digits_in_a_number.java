/*
Count Digits In A Number
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Input Format
"n" where n is any integer.

Output Format
"d" where d is the number of digits in the number "n"

Sample Input
65784383

Sample Output
8
*/

import java.util.*;

public class count_digits_in_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;

        while(n!=0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
        scn.close();
    }
}
