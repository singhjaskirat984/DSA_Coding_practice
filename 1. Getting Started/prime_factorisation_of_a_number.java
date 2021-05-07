/*
Prime Factorisation Of A Number
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.

Input Format
n, an integer

Output Format
p1  p2  p3  p4.. all prime factors of n

Sample Input
1440

Sample Output
2 2 2 2 2 3 3 5
*/


import java.util.*;

public class prime_factorisation_of_a_number {
    public static void main(String[] args) {
        int number=1;
        Scanner s =  new Scanner(System.in);
        number = s.nextInt();

        for(int i=2; i*i<=number; i++){
            while(number%i==0){
                System.out.println(i);
                number = number/i;
            }
        }

        if(number>2){
            System.out.println(number);
        }
    }
}
