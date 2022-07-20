package Recursion_in_arrays;
import java.util.*;

public class p5_all_indices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] ansArray = allIndices(arr, x, 0, 0);
        if(ansArray.length == 0){
            System.out.println();
            return;
        }
        for(int i=0; i<ansArray.length; i++){
            System.out.println(ansArray[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }

        int[] ansArray;
        if(arr[idx] == x){
            ansArray = allIndices(arr, x, idx+1, fsf+1);
            ansArray[fsf] = idx;
        }else{
            ansArray = allIndices(arr, x, idx+1, fsf);
        }
        return ansArray;
    }
}
