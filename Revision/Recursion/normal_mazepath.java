package Recursion;
import java.util.*;

public class normal_mazepath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int count = normalMazepath(0, 0, n-1, m-1, "", 0);

        System.out.println(count);
    }

    public static int normalMazepath(int sr, int sc, int dr, int dc , String ans, int count) {
        if(sr==dr && sc==dc) {
            System.out.println(ans);
            count = count +1;
            return count;
        }

        if(sr>dr || sc>dc) {
            return count;
        }

        int c1 = normalMazepath(sr, sc+1, dr, dc, ans+"H", count);
        int c2 = normalMazepath(sr+1, sc, dr, dc, ans+"V", count);

        count = c1 + c2;

        return count;
    }
}
