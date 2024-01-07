package Arrays;
import java.util.*;

public class calculate_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] copyOfOriginal = new int[n];
        for (int i = 0; i < arr.length; i++) {
            copyOfOriginal[i] = arr[i];
        }

        int iterations = scn.nextInt();
        for (int i = 0; i < iterations; i++) {
            int x = scn.nextInt();
            arr = calculateTheSum(arr, x, copyOfOriginal);
            copyOfOriginal = arr;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        scn.close();
    }

    public static int[] calculateTheSum(int[] arr, int x, int[] copyOfOriginal) {
        for (int i = 0; i < arr.length; i++) {
            int position = calculatePosition(i, x, arr.length);
            arr[i] = arr[i] + copyOfOriginal[position];
        }
        return arr;
    }

    public static int calculatePosition(int currIndex, int x, int arrLen) {
        int pos = currIndex - x;

        while (pos < 0) {
            pos = pos + arrLen;
        }

        return pos;
    }
}
