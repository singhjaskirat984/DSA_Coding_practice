package Recursion;
import java.util.*;

public class mazepath_diagonal_again {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int count = mazePathD(0, 0, n-1, m-1, "",0);

        System.out.println(count);
    }

    public static int mazePathD(int sr, int sc, int dr, int dc, String ans, int count) {

        if(sr==dr && sc==dc) {
            System.out.println(ans);
            count++;
            return count;
        }

        if(sr>dr || sc>dc) {
            return count;
        }

        int c1 = mazePathD(sr, sc+1, dr, dc, ans+"H", count);
        int c2 = mazePathD(sr+1, sc, dr, dc, ans+"V", count);
        int c3 = mazePathD(sr+1, sc+1, dr, dc, ans+"D", count);
        count = c1 + c2 + c3;

        return count;
    }
}
