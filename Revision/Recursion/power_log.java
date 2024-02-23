package Recursion;
import java.util.*;

public class power_log {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        int n = scn.nextInt();

        int ans = powerLog(x, n);

        System.out.println(ans);
    }

    public static int powerLog(int x, int n) {
        if(n==0) {
            return 1;
        }

        int xpnb2 = powerLog(x, n/2);

        int xn = xpnb2 * xpnb2;

        if(n%2==1) {
            xn = xn * x;
        }

        return xn;
    }
}
