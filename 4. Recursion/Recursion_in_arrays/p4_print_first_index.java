package Recursion_in_arrays;
import java.util.*;;

public class p4_print_first_index {
    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fidx = firstIndex(arr, 0, x);
        System.out.println(fidx);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length-1){
            if(arr[idx] == x){
                return idx;
            }else{
                idx=-1;
                return idx;
            }
        }
        
        int fidx = firstIndex(arr, idx+1, x);
        if(arr[idx] == x){
            fidx = idx;
        }
        
        return fidx;
    }
}
