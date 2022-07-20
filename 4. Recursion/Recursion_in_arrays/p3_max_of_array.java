package Recursion_in_arrays;
import java.util.*;

public class p3_max_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, n-1);
        System.out.println(max);
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == 0){
            return arr[idx];
        }

        int max = maxOfArray(arr, idx-1);

        if(arr[idx] > max){
            max = arr[idx];
        }

        return max;
    }
}
