package Recursion_Backtracking;
import java.util.*;;

public class p4_print_NQueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row){
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }

        for(int col=0; col<chess.length; col++){
            if(isItaSafePlaceForQueen(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", "  , row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isItaSafePlaceForQueen(int[][] chess, int row, int col){
        // check if there is any queen in the straight upward direction of the current cell
        for(int i=row-1, j=col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        // check if there is any queen in the left diagonal of current cell
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        // check if there is any queen in the right diagonal of current cell
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;
        }
}

