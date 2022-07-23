import java.util.*;

public class p4_merge_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 =  scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2  =  new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int[] ans = new int[n1+n2];
        ans = mergeTwoSortedArrays(arr1,  arr2, ans);
        print(ans);
    }    

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2, int[] ans){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else if(arr2[j] < arr1[i]){
                ans[k] = arr2[j];
                j++;
                k++;
            }else if(arr1[i] == arr2[j]){
                ans[k] =  arr1[i];
                i++;
                j++;
                k++;
            }
        }
        if(i != arr1.length-1){
            for(int m=i; m<arr1.length; m++){
                ans[k] = arr1[m];
                k++;
            }
        }
        if(j != arr2.length-1){
            for(int m=j; m<arr2.length; m++){
                ans[k] = arr2[m];
                k++;
            }
        }
        return ans;
    }

    public static void print(int[] ans){
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}

// pepcoding
// int[] ans = new int[a.length + b.length];
// int i=0,j=0,k=0;
//     while(i<a.length && j<b.length){
//         if(a[i] < b[j]){
//             ans[k] = a[i];
//             i++;
//         }else {
//             ans[k] = b[j];
//             j++;
//         }
//         k++;
//     }
//     if(i < a.length-1){
//         for(int m=i; m<a.length; m++){
//             ans[k] = a[m];
//             k++;
//         }
//     }
//     if(j < b.length-1){
//         for(int m=j; m<b.length; m++){
//             ans[k] = b[m];
//             k++;
//         }
//     }
//     return ans;
