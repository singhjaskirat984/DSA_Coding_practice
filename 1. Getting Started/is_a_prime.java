import java.util.*;

 
/* 
Input Format
A number t
A number n
A number n
.. t number of times

Output Format
prime
not prime
not prime
.. t number of times

Sample Input
5
13
2
3
4
5

Sample Output
prime
prime
prime
not prime
prime

*/

// is prime Naive solution
/*
public class is_a_prime {

    public static boolean isAPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }    
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=1;i<=t;i++){
            int n = scn.nextInt();
            boolean isPrime = isAPrime(n);
            if(isPrime == false){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        }
        scn.close();
    }
}
*/

import java.lang.Math;

// is prime efficient approach
public class is_a_prime {

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
        int t = scn.nextInt();

        for(int i=1;i<=t;i++){
            int n = scn.nextInt();
            boolean isPrime = isAPrime(n);
            if(isPrime == false){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        }
        scn.close();
    }
}