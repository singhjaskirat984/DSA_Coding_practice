package Introduction_to_recursion;
import java.util.*;

public class p6_power_logarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powerLogarithmic(x,n);
        System.out.println(ans);
    }

    public static int powerLogarithmic(int x, int n){
        if(n==0){
            return 1;
        }

        int ans;
        if(n%2==0){
            ans = powerLogarithmic(x, n/2) * powerLogarithmic(x, n/2);
        }else{
            ans = x * powerLogarithmic(x, n/2) * powerLogarithmic(x, n/2);
        }

        return ans;
    }


}
