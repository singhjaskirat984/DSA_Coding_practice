import java.util.*;

public class p3_NGETR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] ans = solve(arr);
        print(ans);
    }

    public static int[] solve(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        ans[ans.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i]>=st.peek()) {
                    st.pop();
            }
            if(st.size()==0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return ans;
    }

    public static void print(int[] ans){
        System.out.println();
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
