/*
Pythagorean Triplet
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

Input Format
a, an integer
b, an integer
c, an integer

Output Format
true if the numbers form a pythagorean triplet and false otherwise

Sample Input
5 3 4

Sample Output
true
*/

    import java.util.*;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        int largest = a>b ? (a>c ? a:c) : (b>c ? b:c);
        if(a==largest){
            a=b;
            b=c;
        }else if(b==largest){
            b=c;
        }else if(c==largest){
            a=a;
            b=b;
        }
        if((a*a) + (b*b) == (largest*largest)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        S.close();
    }
}
