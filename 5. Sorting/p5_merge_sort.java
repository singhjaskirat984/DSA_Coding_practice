import java.util.*;

public class p5_merge_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] ans = mergeSort(arr);
        
        print(ans);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] a = new int[mid];
        for(int i=0; i<mid; i++){
            a[i] = arr[i];
        }
        int[] b = new int[arr.length-mid];
        for(int i=mid,j=0; i<arr.length&&j<arr.length-mid; i++){
            b[j] = arr[i];
        }

        int[] c = mergeSort(a);
        int[] d = mergeSort(b);

        int[] ans = mergeTwoSortedArrays(c, d);

        return ans;
    }

    // OR Pepcoding approach with lower space complexity
    // not actually halved the elements or arrays
    // just kept on halving their size count
    // and made a base case in which acc to that halving 
    // if low == high then we make new array and pass an element in it
    // public static int[] mergeSort(int[] arr, int lo, int hi) { //1
    //     if (lo == hi) {                                                                      //2
    //       int[]ba = new int[1];
    //       ba[0] = arr[lo];
    //       return ba;
    //     }
    //     int mid = (lo + hi) / 2;                                                     //3
    //     int[] f = mergeSort(arr, lo, mid);                                 //4
    //     int[] s = mergeSort(arr, mid + 1, hi);                        //5
    //     int[] fin = mergeTwoSortedArrays(f, s);                 //6
    //     return fin;                                                                     //7
    // }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] ans = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
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
            k++;
            i++;
        }

        while(j<b.length){
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
