import java.util.*;

public class p6_quick_sort {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }

        int pivot = arr[hi];
        int pivotIndex = partitionArray(arr, pivot, lo, hi);
        quickSort(arr, lo, pivotIndex-1);
        quickSort(arr, pivotIndex+1, hi);
    } 

    public  static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public  static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionArray(int[] arr, int pivot, int lo, int hi){
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
}

