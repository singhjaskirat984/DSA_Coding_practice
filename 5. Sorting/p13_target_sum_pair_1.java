import java.util.*;

// public class p13_target_sum_pair_1 {
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0; i<arr.length; i++){
    //         arr[i] = scn.nextInt();
    //     }
    //     int target =  scn.nextInt();
    //     targetSumPair1(arr, target, 0, arr.length-1);
    // }

    // public static void targetSumPair1(int[] arr, int target, int lo, int hi){
    //     if(lo>=hi){
    //         return;
    //     }

    //     int pivot = arr[hi];
    //     int pivotIndex = partition(arr, lo, hi, pivot, target);
    //     targetSumPair1(arr, target, lo, pivotIndex-1);
    //     targetSumPair1(arr, target, pivotIndex+1, hi);
    // }

    // public static int partition(int[] arr, int lo, int hi, int pivot, int target){
    //     int i=lo, j=lo;
    //     while(i<=hi){
    //         if(arr[i]<=pivot){
    //             System.out.println("comparing arr[i] " + arr[i] + " with pivot " + pivot);
    //             if(arr[i] + pivot == target){
    //                 System.out.println("smaller printed");
    //                 System.out.println(arr[i] + ", " + pivot);
    //             }
    //             swap(arr, i, j);
    //             i++;
    //             j++;
    //         }else{
    //             System.out.println("comparing pivot " + pivot + "  with arr[i] " + arr[i]);
    //             if(arr[i] + pivot == target){
    //                 System.out.println("greater printed");
    //                 System.out.println(pivot + ", " + target);
    //             }
    //             i++;
    //         }
    //     }
    //     return j-1;
    // }

    // public static void swap(int[] arr, int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
// }

public class p13_target_sum_pair_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target =  scn.nextInt();
        targetSumPair1(arr, target
        );
    }

    public static void targetSumPair1(int[] arr, int target){
        arr = mergeSort(arr, 0, arr.length-1); 
        int i=0, j=arr.length-1;
        while(i<=j){
            if(arr[i]+arr[j]>target){
                j--;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else if(arr[i]+arr[j]==target){
                System.out.println(arr[i] + ", " + arr[j]);
                i++;
                j--;
            }
        }
        
    }

    public static int[] mergeSort(int[] arr, int lo,  int hi){
        if(lo == hi){
            int[] baseArray =  new  int[1];
            baseArray[0] = arr[lo];
            return baseArray;
        }

        int mid = (lo+hi)/2;
        int[] a = mergeSort(arr, lo, mid);
        int[] b = mergeSort(arr, mid+1, hi);
        int[] ans = mergeTwoSortedArrays(a, b);
        return ans;
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int i=0, j=0, k=0;
        int[] ans = new int[a.length + b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                ans[k] = a[i];
                i++;
                k++;
            }else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            ans[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length){
            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;
    }

    public static void  print(int[] arr){
        System.out.println();
        for(int  i=0;  i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 
}
