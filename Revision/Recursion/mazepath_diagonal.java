package Recursion;
import java.util.*;

public class mazepath_diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        mazepathD(0, 0, n-1, m-1, "");


    }

    public static void mazepathD(int sr, int sc, int dr, int dc, String ans) {

        // if(sr>dr || sc>dc) {
        //     return;
        // }

        if(sr==dr && sc==dc) {
            System.out.println(ans);
            return;
        }

        if(sr<dr) {
            mazepathD(sr+1, sc, dr, dc, ans + 'V');
        }

        if(sc<dc) {
            mazepathD(sr, sc+1, dr, dc, ans+"H");
        }

        if(sr<dr || sc<dc) {
            mazepathD(sr+1, sc+1, dr, dc, ans+"D");
        }
    }
}