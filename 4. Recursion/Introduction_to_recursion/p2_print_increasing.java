package Introduction_to_recursion;
import java.util.*;

public class p2_print_increasing{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       printDecreasing(n); 
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        printDecreasing(n-1);
        System.out.println(n);
    }

    
}