package Recursion;
import java.util.*;

public class target_sum_pair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr, target);
        scn.close();
    }

    private static void targetSumPair(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int pairsum = arr[i] + arr[j];
                if(pairsum==target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}
