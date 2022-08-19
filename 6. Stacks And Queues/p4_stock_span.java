import java.util.*;

public class p4_stock_span {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] ans  = stockSpan(arr);
        print(ans);
    }

    public static int[] stockSpan(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stIndex = new Stack<>();
        st.push(arr[0]);
        ans[0] = 1;
        stIndex.push(0);

        for(int i=1; i<arr.length; i++){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
                stIndex.pop();
            }

            if(st.size()==0){
                ans[i] = i+1;
            }else{
                ans[i] = i-stIndex.peek();
            }

            st.push(arr[i]);
            stIndex.push(i);
        }
        return ans;
    }

    public static void print(int[] ans){
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
