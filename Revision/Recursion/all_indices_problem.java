package Recursion;
import java.util.*;

public class all_indices_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        AllIndicesProblem(0, arr, target);
    }

    public static void AllIndicesProblem(int idx, int[] arr, int target) {
        if(idx==arr.length) {
            return;
        }

        if(arr[idx] == target) {
            System.out.println(idx);
        }

        AllIndicesProblem(idx+1, arr, target);
    }
}
