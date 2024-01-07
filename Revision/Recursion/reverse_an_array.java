package Recursion;
import java.util.*;

public class reverse_an_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length;i++) {
            arr[i] = scn.nextInt();
        }

        reverseAnArray(arr);
        scn.close();
    }

    public static void reverseAnArray(int[] arr) {
        int l=0;
        int h = arr.length-1;

        while(l<h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
