package Recursion_in_arrays;
import java.util.*;


public class p1_display_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        displayArray(arr, n-1);
    }

    public static void displayArray(int[] arr, int n){
        if(n<0){
            return;
        }
        displayArray(arr, n-1);
        System.out.println(arr[n]);
    }


}
