package Recursion_in_Arraylists;
import java.util.*;

public class p4_getMazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ansArrayList = getMazePaths(1,1,n,m);
        System.out.println(ansArrayList);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> ansArrayList = new ArrayList<>();
            ansArrayList.add("");
            return ansArrayList;
        }

        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();

        if(sc < dc){
            hPaths = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr < dr){
            vPaths = getMazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(int i=0; i<hPaths.size(); i++){
            paths.add("h" + hPaths.get(i));
        }

        for(int i=0; i<vPaths.size(); i++){
            paths.add("v" + vPaths.get(i));
        }

        return paths;
    }
}
