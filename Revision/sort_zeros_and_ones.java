import java.util.*;

public class sort_zeros_and_ones {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        sortZerosAndOnes(arr);
        scn.close();
    }

    public static void sortZerosAndOnes(int[] arr) {
        int[] ans = new int[arr.length];
        int h = arr.length-1;
        int l = 0; 
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0) {
                ans[l] = 0;
                l++;
            }else {
                ans[h] = 1;
                h--;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]);
            System.out.print(" ");
        }
    }
}
