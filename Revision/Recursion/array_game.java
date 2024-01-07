package Recursion;
import java.util.*;

public class array_game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        arrayGame(0, arr, 0, n);

        // System.out.println(count);
    }

    public static void arrayGame(int i, int[] arr, int count, int n) {
        if(i==arr.length-1) {
            System.out.println(count);
            return;
        }

        int left = 0;
        for(int j=0; j<=i; j++) {
            left = left + arr[j];
        }

        int right = 0;
        for(int j=i+1; j<arr.length; j++) {
            right += arr[j];
        }

        if(left == right) {
            count++;
            int[] newArray = new int[(n-1)-i];
            int k=0;
            for(int j=i+1; j<arr.length; j++) {
                newArray[k] = arr[j];
                k++;                               
            }
            arrayGame(0, newArray, count, n);
        }else {
            arrayGame(i+1, arr, count, n);
        }
    }
}
