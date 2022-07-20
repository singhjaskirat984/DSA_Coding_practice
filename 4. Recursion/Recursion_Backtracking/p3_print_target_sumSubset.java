package Recursion_Backtracking;
import java.util.*;

public class p3_print_target_sumSubset {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar){
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
                return;
            }
            return;
        }

        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }
}
