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
        int[] ans = mergeTwoSortedArrays(arr1,  arr2);
        print(ans);
    }    

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] ans = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                ans[k] = a[i];
                i++;
                k++;
            }else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        
        while(i < a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        
        while(j < b.length){
            ans[k] = b[j];
            j++;
            k++;
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
