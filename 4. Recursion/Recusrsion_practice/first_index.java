package Recusrsion_practice;
import java.util.*;

public class first_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fidx = firstIndex(arr, 0, x);
        System.out.println(fidx);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx == arr.length-1){
            if(arr[idx] == x){
                return idx;
            }else {
                return -1;
            }
        }
        if(arr[idx] == x){
            return idx;
        }
        int fidx = firstIndex(arr, idx+1, x);
        return fidx;
    }
}
