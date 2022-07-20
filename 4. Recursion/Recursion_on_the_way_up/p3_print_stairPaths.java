package Recursion_on_the_way_up;
import java.util.*;

public class p3_print_stairPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n, "");   
    }

    public static void printStairPaths(int n, String ans){
        if(n<=0){
            if(n==0){
                System.out.println(ans);
            }
            return;
        }

        printStairPaths(n-1, ans + 1);
        printStairPaths(n-2, ans + 2);
        printStairPaths(n-3, ans + 3);
    }
}
