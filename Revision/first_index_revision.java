import java.util.*;

public class first_index_revision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        firstIndex(0, arr, target, -1);
    }

    public static void firstIndex(int idx, int[] arr, int target, int ans) {
        if(idx==arr.length) {
            return;
        }

        if(arr[idx]==target) {
            System.out.println(idx);
            return;
        }

        firstIndex(idx+1, arr, target, ans);
    }
}
