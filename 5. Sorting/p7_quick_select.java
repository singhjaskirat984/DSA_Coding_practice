import java.util.*;

public class p7_quick_select {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr =  new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int ans = quickSelect(arr, 0, arr.length-1, k-1);
        System.out.println(ans);
    }

    public static int quickSelect(int[] arr, int lo,  int hi, int k){
        int pivot = arr[hi];
        int pivotIndex = partition(arr, pivot, lo, hi);
        if(k<pivotIndex){
            return quickSelect(arr, lo, pivotIndex-1, k);
        }else if(k>pivotIndex){
            return quickSelect(arr, pivotIndex+1, hi, k);
        }
        return pivot;
    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        int i=lo, j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
