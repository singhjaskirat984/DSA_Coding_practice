package Recursion;
import java.util.*;

public class floodfill_revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        floodFillRevison(0, 0, maze,  "",visited);
        scn.close();
    }

    public static void floodFillRevison(int sr, int sc, int[][] maze, String ans, boolean[][] visited) {

        if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1 || visited[sr][sc]==true) {
            return;
        }

        if(sr==maze.length-1 && sc==maze[0].length-1) {
            System.out.println(ans);
            return;
        }

        visited[sr][sc] = true;
        floodFillRevison(sr, sc+1, maze, ans+"R"+" ", visited);
        floodFillRevison(sr, sc-1, maze, ans+"L"+" ", visited);
        floodFillRevison(sr-1, sc, maze, ans+"T"+" ", visited);
        floodFillRevison(sr+1, sc, maze, ans+"D"+" ", visited);
        visited[sr][sc] = false;
    }
}
