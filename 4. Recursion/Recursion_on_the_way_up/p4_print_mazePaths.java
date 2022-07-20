package Recursion_on_the_way_up;
import java.util.*;

public class p4_print_mazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n-1, m-1, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans){
        if(sr>dr || sc>dc){
            return;
        }

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }

        printMazePaths(sr, sc+1, dr, dc, ans + "h");
        printMazePaths(sr+1, sc, dr, dc, ans + "v");
    }
}
