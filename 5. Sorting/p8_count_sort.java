import java.util.*;

public class p8_count_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, max , min);
        print(arr);
    }

    public static void countSort(int[] arr, int max, int min){
        int[] farr = new int[max-min+1];
        int[] arrCopy = new int[arr.length];

        // to make copy of arr
        for(int i=0 ;i<arr.length; i++){
            arrCopy[i] = arr[i];
        }

        // to give all elements initial value to be 0 in farr
        for(int i=0; i<farr.length; i++){
            farr[i] = 0;
        }
 
        // to populate the freq array with frequencies of elements
        for(int i=0; i<arr.length; i++){
            int farrIndex = arr[i] - min;
            farr[farrIndex] += 1;
        }

        // to convert freq array into prefic sum array
        for(int i=0; i<farr.length-1; i++){
            farr[i+1] = farr[i] + farr[i+1];
        }

        // to remove 1 from all elements of pref sum array so that all elements value can be in arr's index range
        for(int i=0; i<farr.length; i++){
            farr[i] -= 1;
        }

        // to arrange the element in the sorted order using a copy array as original array and 
        // making direct changes in original arr
        for(int i=arrCopy.length-1; i>=0; i--){
            int farrIndex = arrCopy[i] - min;
            arr[farr[farrIndex]] = arrCopy[i];
            farr[farrIndex]--;
        }
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
