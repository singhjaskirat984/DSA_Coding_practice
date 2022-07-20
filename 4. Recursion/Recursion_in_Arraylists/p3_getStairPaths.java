package Recursion_in_Arraylists;
import java.util.*;

public class p3_getStairPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ansArrayList = getStairPaths(n);
        System.out.println(ansArrayList);
    }

    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> ansArrayList = new ArrayList<>();
            ansArrayList.add("");
            return ansArrayList;
        }else if(n<0){
            ArrayList<String> ansArrayList = new ArrayList<>();
            return ansArrayList;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for(int i=0; i<path1.size(); i++){
            paths.add("1" + path1.get(i));
        }

        for(int i=0; i<path2.size(); i++){
            paths.add("2" + path2.get(i));
        }

        for(int i=0; i<path3.size(); i++){
            paths.add("3" + path3.get(i));
        }

        return paths;
      }
}
