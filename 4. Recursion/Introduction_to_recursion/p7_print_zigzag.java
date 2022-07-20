package Introduction_to_recursion;
import java.util.*;

public class p7_print_zigzag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printZigZag(n);
    }

    public static void printZigZag(int n){
        if(n==0){
            return;
        }

        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
    }
}
