import java.util.*;

public class target_sum_triplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumTriplet(arr, target);
        scn.close();
    }

    private static void targetSumTriplet(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++) {
                // if(i!=j) {
                    int pairSum = arr[i] + arr[j];
                    if(pairSum>=target) {
                        continue;
                    }else{
                        for(int k=j+1; k<arr.length; k++) {
                            // if(i!=k && j!=k) {
                                int t = arr[k] + pairSum;
                                if(t==target) {
                                    System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                                }
                            // }
                        }
                    }
                // }
            }
        } 
    }
}
