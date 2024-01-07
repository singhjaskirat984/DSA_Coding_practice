import java.util.*;

public class subset_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        int count = printSubsets(arr, target, n , 0, "", 0, 0);
        System.out.println();
        System.out.println(count);
    }

    public static int printSubsets(int[] arr, int target, int n, int idx, String ans, int sumOfSubset, int count) {

        if(idx==n) {
            if(target == sumOfSubset){
                System.out.print(ans);
                System.out.print("  ");
                count++;
            }
            return count;
        }

        int r1 = printSubsets(arr, target, n, idx+1, ans+arr[idx]+" " , sumOfSubset+arr[idx], count);
        int r2 = printSubsets(arr, target, n, idx+1, ans, sumOfSubset, count);

        count = r1 + r2;

        return count;
    }
}
