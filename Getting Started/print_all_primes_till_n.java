/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included)

Input Format
low 
high

Output Format
n1
n2
.. all primes between low and high (both included)

Sample Input
6 
24

Sample Output
7
11
13
17
19
23

*/

import java.util.*;

public class print_all_primes_till_n {

    public static boolean isAPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }    
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        for(int i=n1; i<=n2; i++){
            boolean isPrime = isAPrime(i);
            if(isPrime == true){
                System.out.println(i);
            }
        }
        scn.close();
    }
}
