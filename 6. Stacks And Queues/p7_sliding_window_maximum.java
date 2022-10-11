import java.util.*;;

public class p7_sliding_window_maximum {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    slidingWindowMaximum(arr, k);
   } 

   public static void slidingWindowMaximum(int[] arr, int k){
    // find NGETR -> Next greater element to the right indices
    int[] ngetr = NGETR(arr);

    int j=0; // optimisation
    for(int i=0; i<=arr.length-k; i++){
        // int j = i;

        // optimisation
        if(j<i){
            j = i;
        }

        while(ngetr[j]<i+k){
            j = ngetr[j];
        }

        System.out.println(arr[j]);
    }

   }

   public static int[] NGETR(int[] arr){
    int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    ans[arr.length-1] = arr.length;
    st.push(arr.length-1);
    for(int i=arr.length-2; i>=0; i--){
        // pop
        while(st.size()>0 && arr[st.peek()]<arr[i]){
            st.pop();
        }

        // ans
        if(st.size()==0){
            ans[i] = arr.length;
        }else{
            ans[i] = st.peek();
        }

        // push
        st.push(i);
    }

    return ans;
   }

   public static void print(int[] arr){
    for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]);
        System.out.print(" ");
    }
   }
}
 