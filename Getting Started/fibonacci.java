/*
Print Fibonacci Numbers Till N
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Input Format
n

Output Format
0
1
1
2
3
5
8
.. first n fibonaccis

Sample Input
10

Sample Output
0
1
1
2
3
5
8
13
21
34

*/

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0, b=1, c=0;

        System.out.println(a);
        System.out.println(b);

        for(int i=2; i<n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        scn.close();
    }
}
