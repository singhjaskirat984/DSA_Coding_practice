package Recursion_in_arrays;
import java.util.*;

public class p2_display_array_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        displayReverseArray(arr, n-1);
    }

    public static void displayReverseArray(int[] arr, int n){
        if(n<0){
            return;
        }

        System.out.println(arr[n]);
        displayReverseArray(arr, n-1);
    }
}
