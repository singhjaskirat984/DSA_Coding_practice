import java.util.*;

public class p5_largest_area_histogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans  = largestAreaHistogram(arr);
        System.out.println(ans);
    }

    public static int largestAreaHistogram(int[] arr){
        // function to find the index of smaller element on the left 
        // if no element smaller then enter the idx as 0
        int[] leftArr = SMETL(arr);
        int[] rightArr = SMETR(arr);
        
        int max = Integer.MIN_VALUE;
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int left = 0;
            if(i==0 || leftArr[i]==0){
                left = i - leftArr[i];
            }else{
                // if not zero to ek count zyada ara tha i.e why -1
                left = (i - leftArr[i]) - 1;
            }
            int right = 0;
            if(rightArr[i]==arr.length-1 || i==arr.length-1){
                // if end element then 1 count km ara tha i.e why +1
                right = (rightArr[i] - i) + 1;
            }else{
                right = rightArr[i] - i;
            }
            int sum = left+right;
            int area = sum * arr[i];
            ans[i] = area;
            if(max<area){
                max = area;
            }
        }
        print(ans);
        return max;
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] SMETL(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stIndex = new Stack<>();
        st.push(arr[0]);
        ans[0] = 0;
        stIndex.push(0);
        for(int i=1; i<arr.length; i++){
            // pop
            while(st.size()>0 && st.peek()>=arr[i]){
                st.pop();
                stIndex.pop();
            }

            // ans
            if(st.size()==0){
                ans[i] = 0;
            }else{
                ans[i] = stIndex.peek();
            }

            // addition push
            st.push(arr[i]);
            stIndex.push(i);
        }
        return ans;
    }

    public static int[] SMETR(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stIndex = new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1] = arr.length-1;
        stIndex.push(arr.length-1);
        for(int i=arr.length-2; i>=0; i--){
            // pop
            while(st.size()>0 && st.peek()>=arr[i]){
                st.pop();
                stIndex.pop();
            }

            // ans
            if(st.size()==0){
                ans[i] = arr.length-1;
            }else{
                ans[i] = stIndex.peek();
            }

            // addition push
            st.push(arr[i]);
            stIndex.push(i);
        }
        return ans;
    }
}
