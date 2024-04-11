package Arrays;

import java.util.Scanner;

public class ceil_and_floor_in_array {
    public static void main(String[] args) {
        int[] arr = {12, 25, 40, 62, 30, 37, 50, 75, 87};

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        // find ceil and floor of a given number
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>x && arr[i]<ceil) {
                ceil = arr[i];
            }

            if(arr[i]<x && arr[i]>floor) {
                floor = arr[i];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);

        scn.close();
    }
    
}
