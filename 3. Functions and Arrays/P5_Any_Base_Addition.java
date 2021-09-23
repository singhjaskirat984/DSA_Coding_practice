/*
Programme 5 - Any Base Addition

1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.

Input Format
A base b
A number n1
A number n2

Output Format
A number representing the sum of n1 and n2 in base b.

Sample Input
8
777
1

Sample Output
1000

*/

import java.util.*;

public class P5_Any_Base_Addition{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        int rem_result=0;
        int carry = 0;
        int power = 1;
        int result = 0;
        while(n1!=0 || n2!=0){
            int rem1 = n1%10;
            int rem2 = n2%10;

            rem_result = rem1 + rem2 + carry;

            if(rem_result >= b){
                rem_result = rem_result - b;
                carry = 1;
            }else{
                carry = 0;
            }

            result = result + (rem_result * power);

            power = power * 10;

            n1=n1/10;
            n2=n2/10;
        }

        if(carry == 1){
            result = result + (carry * power);
        }

        return result;
    }
}