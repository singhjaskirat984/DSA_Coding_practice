import java.util.*;

public class p12_sort012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }

    public static void sort012(int[] arr){
        int i=0, j=0, k=arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  print(int[] arr){
        System.out.println();
        for(int  i=0;  i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 
}
