import java.util.*;

public class boardPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int count = printBoardPath(n, m, "", 0);
        System.out.println(count);
    }

    public static int printBoardPath(int n, int m, String ans, int count) {
        if(n<=0) {
            if(n==0){
                System.out.println(ans);
                count = count+1;
            }
            return count;
        } 

        for(int i=0; i<m; i++) {
           printBoardPath(n-(i+1), m, ans+(i+1)+"", count);
        }

        return count;
    }


}
