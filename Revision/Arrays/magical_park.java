package Arrays;
import java.util.*;

public class magical_park {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();
        int s = scn.nextInt();

        String[][] arr = new String[n][m];

        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = scn.next();
            }
        }

        magicalPark(n, m, k, s, arr);

        
    }

    public static void magicalPark(int n, int m, int k, int s, String[][] arr) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j].equals(".")){
                    s-=2;
                }else if(arr[i][j].equals("*")){
                    s+=5;
                }else if(arr[i][j].equals("#")){
                    break;
                }
                if(j!=m-1) {
                    s--;
                }
                if(s<k){
                    System.out.println("No");
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println("Yes");
        System.out.println(s);
    }
}
