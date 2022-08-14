import java.util.*;

public class p1_min_cost_path {
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
        minCostPath(arr, 0, 0, "", Integer.MAX_VALUE, "", visited);
    }

    public static void minCostPath(int[][] arr, int row, int col, String ans, int min, String minStrPath, boolean[][] visited){
        if(row<0 || col<0 || row==arr.length || col==arr[0].length || visited[row][col]==true){
            return;
        }
        
        if(row==arr.length-1 && col==arr[0].length-1){
            // ans = ans + arr[row][col];
            // String finalMinPath = checkMin(min, ans, minStrPath);
            String[] splited = ans.split("\\s+");
            int sum = 0;
            for(int i=1; i<splited.length; i++){
                sum = sum + Integer.parseInt(splited[i]);
            }
            if(sum<min){
                min = sum;
                minStrPath = ans;
            }
            System.out.println(minStrPath);
            return;
        }

        int num = arr[row][col];
        visited[row][col] = true;
        // left
        minCostPath(arr, row, col-1, ans+ " " +num, min, minStrPath, visited);
        // top
        minCostPath(arr, row-1, col, ans+ " " +num, min, minStrPath, visited);
        // right
        minCostPath(arr, row, col+1, ans+ " " +num, min, minStrPath, visited);
        // Down
        minCostPath(arr, row+1, col, ans+ " " +num, min, minStrPath, visited);
        visited[row][col] = false;
    }
}
