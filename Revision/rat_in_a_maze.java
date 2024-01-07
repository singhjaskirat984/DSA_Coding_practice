import java.util.*;

public class rat_in_a_maze {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        int[][] ansMaze = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                ansMaze[i][j] = 0;
            }
        }

        RatInAMaze(0, 0, maze, ansMaze);
    }

    public static void RatInAMaze(int sr, int sc, int[][] maze, int[][] ansMaze) {
        if(sr==maze.length || sc==maze[0].length || maze[sr][sc]==1) {
            return;
        }

        if(sr==maze.length-1 && sc==maze[0].length-1) {
            ansMaze[sr][sc] = 1;
            System.out.println();
            for(int i=0; i<ansMaze.length; i++) {
                for(int j=0; j<ansMaze[0].length; j++) {
                    System.out.print(ansMaze[i][j] + " ");
                }
                System.out.println(); 
            }
            return;
        }

        ansMaze[sr][sc] = 1;
        RatInAMaze(sr, sc+1, maze, ansMaze);
        RatInAMaze(sr+1, sc, maze, ansMaze);
        ansMaze[sr][sc] = 0;
    }
}
