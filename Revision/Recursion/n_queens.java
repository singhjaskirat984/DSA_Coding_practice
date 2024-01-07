package Recursion;
import java.util.*;

public class n_queens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String ans, int row) {
        
        if(row==chess.length) {
            System.out.println(ans);
            return;
        }

        for(int col=0; col<chess.length; col++) {
            if(isItSafeToPlaceTheQueen(chess, row, col)==true) {
                chess[row][col] = 1;
                printNQueens(chess, ans + row + "-" + col + ", ", row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static Boolean isItSafeToPlaceTheQueen(int[][] chess, int row, int col) {

        // check the upward direction
        for(int i=row-1, j=col; i>=0; i--) {
            if(chess[i][j]==1) {
                return false;
            }
        }

        // check the left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(chess[i][j]==1) {
                return false;
            }
        }

        // check the right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++) {
            if(chess[i][j]==1) {
                return false;
            }
        }

        return true;
    }
}
