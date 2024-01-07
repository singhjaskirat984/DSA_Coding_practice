package Recursion;
import java.util.*;

public class last_index_revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int index = lastIndex(0, arr, target, -1);
        System.out.println(index);
    }

    public static int lastIndex(int idx, int[] arr, int target, int ans) {
        if(idx==arr.length) {
            return ans;
        }

        if(arr[idx]==target) {
            ans = idx;
        }

        int i = lastIndex(idx+1, arr, target, ans);

        return i;
    }
}
