import java.util.*;;

public class p3_Insertion_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        insertionSort(arr);
        print(arr);
    }

    public static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j>=0; j--){
                if(isGreater(arr, j, j+1)){
                    swap(arr, j, j+1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isGreater(int[] arr, int i, int j){
        if(arr[i] > arr[j]){
            return true;
        }else{
            return false;
        }
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
