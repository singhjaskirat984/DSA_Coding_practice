import java.util.*;

public class p11_sort01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort01(arr);
        print(arr);
    }

    public static void sort01(int[] arr){
        int i=0, j=0;
        while(i<arr.length){
            if(arr[i]==0){
                swap(arr, i, j);
                j++;
                i++;
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  print(int[] arr){
        for(int  i=0;  i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
