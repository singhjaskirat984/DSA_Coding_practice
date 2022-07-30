import java.util.*;

public class p5_partition_an_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partitionArray(a, pivot);
        print(a);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void partitionArray(int[] arr, int pivot){
        int i=0, j=0;
        while(i<arr.length){
            if(arr[i]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
    }

    public static  void print(int[] arr){
        for(int i=0; i<arr.length;  i++){
            System.out.println(arr[i]);
        }
    }
}
