package Recursion;
import java.util.*;


public class subset_brute {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // int target = scn.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
        }


    }
}
