/*
Rotate A Number
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340

Input Format
"n" where n is any integer.
"K" where k is any integer.

Output Format
"r", the rotated number

Sample Input
562984
2

Sample Output
845629
*/



import java.util.*;
   
   public class rotate_a_number {
   
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           int k = scn.nextInt();
   
           int nod = 0;
           int temp = n;
           while(temp != 0){
               temp /= 10;
               nod++;
           }
   
           k = k % nod;
           if(k < 0)
               k += nod;
   
           int div = 1;
           int mult = 1;
           for(int i = 1; i <= nod; i++){
               if(i <= k)
                   div *= 10;
               else 
                   mult *= 10;
           }
   
           int quo = n / div;
           int rem = n % div;
   
           int r = rem * mult + quo;
           System.out.println(r);
       }
   }