package Recursion_Backtracking;
import java.util.*;

public class p2_print_targetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubset(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubset(int[] arr, int idx, String set, int sos, int tar){
        if(idx == arr.length){
            return;
        }

        if(sos == tar){
            System.out.println(set);
            return;
        }

        for(int i=idx; i<arr.length; i++){
            printTargetSumSubset(arr, idx+1, set + arr[i], sos + arr[i], tar);
        }
    }
}
