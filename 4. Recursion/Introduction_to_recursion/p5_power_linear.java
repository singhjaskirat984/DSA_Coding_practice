package Introduction_to_recursion;
import java.util.*;

public class p5_power_linear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powerLinear(x,n);
        System.out.println(ans);
    }

    public static int powerLinear(int x, int n){
        if(n==0){
            return 1;
        }

        int ans = x * powerLinear(x, n-1);
        return ans;
    }
}
