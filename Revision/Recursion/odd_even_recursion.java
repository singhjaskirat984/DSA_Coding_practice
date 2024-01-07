package Recursion;
import java.util.*;

public class odd_even_recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        oddEvenRecursion(n);
        scn.close();
    }

    public static void oddEvenRecursion(int n) {
        if (n==0) {
            return;
        }

        if(n%2!=0) {
            System.out.println(n);
        }

        oddEvenRecursion(n-1);

        if(n%2==0){
            System.out.println(n);
        }
    }
}
