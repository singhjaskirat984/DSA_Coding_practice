/*
Digits Of A Number
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Input Format
"n" where n is any integer.

Output Format
d1
d2
d3
... digits of the number

Sample Input
65784383

Sample Output
6
5
7
8
4
3
8
3
*/

import java.util.*;

public class digits_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0,i=0;
        int arr[] = new int[100];

        while(n!=0){
            int rem=n%10;
            arr[i]=rem;
            i++;
            count++;
            n=n/10;
        }

        for(int j=count-1; j>=0; j--){
            System.out.println(arr[j]);
        }
        scn.close();
    }
}
