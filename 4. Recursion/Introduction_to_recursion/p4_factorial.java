package Introduction_to_recursion;
import java.util.*;

public class p4_factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }


        int ans = n * factorial(n-1);
        return ans;
    }
}
