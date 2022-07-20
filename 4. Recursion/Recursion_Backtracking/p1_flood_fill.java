package Recursion_Backtracking;
import java.util.*;

public class p1_flood_fill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodFill(arr, 0, 0, "", visited);
    }

    public static void floodFill(int[][] maze, int sr, int sc, String asf, boolean[][] visited){
        if(sr<0  || sc<0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true){
            return;
        }

        if(sr == maze.length -1 && sc == maze[0].length - 1){
            System.out.println(asf);
            return;
        }

        visited[sr][sc] = true;
        floodFill(maze, sr, sc-1, asf + "l", visited);
        floodFill(maze, sr-1, sc, asf + "t", visited);
        floodFill(maze, sr, sc+1, asf + "r", visited);
        floodFill(maze, sr+1, sc, asf + "d", visited);
        visited[sr][sc] = false;
    }
}
