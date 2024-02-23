package Recursion;
import java.util.*;

public class longest_subarray_sum_zero {

    private static String longest = "";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        longestSubarray(0, arr,  "", 0);

        System.out.println(longest);


    }

    public static void longestSubarray(int idx, int[] arr, String ans, int sumOfSubset) {
        if(idx == arr.length) {
            int size1 = longest.length();
            int size2 = ans.length();

            if(size2>size1 && sumOfSubset==0) {
                longest = ans;
            }

            return;
        }

        longestSubarray(idx+1, arr, ans + arr[idx], sumOfSubset + arr[idx]);
        longestSubarray(idx+1, arr, ans, sumOfSubset);
    }
}
