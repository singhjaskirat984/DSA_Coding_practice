import java.util.*;

public class tower_of_hano_revise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int source = scn.nextInt();
        int helper = scn.nextInt();
        int destination = scn.nextInt();;

        toh(n, source, helper, destination);
    }

    public static void toh(int n, int s, int h, int d) {
        if(n==0) {
            return;
        }

        toh(n-1, s, h, d);
        System.out.println(n + "[" + s + " -> " + h + "]");
        toh(n-1, h, d, s);
    }
}
