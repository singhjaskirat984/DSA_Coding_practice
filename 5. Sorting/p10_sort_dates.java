import java.util.*;

public class p10_sort_dates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortDates(arr);
        print(arr);
    }

    public static void sortDates(int[] arr){
        countSort(arr, 1000000, 1, 0);
        countSort(arr, 10000, 100, 0);
        countSort(arr, 1, 10000, 0);
    }

    public static void countSort(int[] arr, int div, int mod, int range){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, (arr[i]/div)%mod);
            min = Math.min(min, (arr[i]/div)%mod);
        }

        int[] farr = new int[max-min+1];
        int[] ans = new int[arr.length];

        // populate freq array
        for(int i=0; i<arr.length; i++){
            int farrIndex = (arr[i]/div)%mod - min;
            farr[farrIndex]++;
        }

        // convert freq array to prefix sum array
        for(int i=0; i<farr.length-1; i++){
            farr[i+1] =  farr[i] + farr[i+1];
        }

        // main stable count sorting
        for(int i=arr.length-1; i>=0; i--){
            int farrIndex = (arr[i]/div)%mod - min;
            ans[farr[farrIndex]-1] = arr[i];
            farr[farrIndex]--;
        }

        // copy ans to arr
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
 