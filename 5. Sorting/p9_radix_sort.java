import java.util.*;

public class p9_radix_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

    public static void radixSort(int[] arr){
        // find max in arr
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        int exp = 1;
        while(max != 0){
            countSort(arr, exp);
            max = max/10;
            exp = exp * 10;
        }
    }

    public static void countSort(int[] arr, int exp){
        int div = exp * 10;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]%div);
            min = Math.min(min, arr[i]%div);
        }
        int[] farr =  new int[max-min+1];
        int[] ans  = new int[arr.length];
        // populate freq array
        for(int i=0; i<arr.length; i++){
            int farIndex = (arr[i]%div) - min;
            farr[farIndex]++;
        }

        // convert freq array to prefix sum array
        for(int i=0; i< farr.length-1; i++){
            farr[i+1] = farr[i] + farr[i+1];
        }

        // main sorting
        for(int i=arr.length-1; i>=0; i--){
            int farrIndex = (arr[i]%div) - min;
            ans[farr[farrIndex]-1] = arr[i];
            farr[farrIndex]--;
        }

        // plotting arr from ans
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
