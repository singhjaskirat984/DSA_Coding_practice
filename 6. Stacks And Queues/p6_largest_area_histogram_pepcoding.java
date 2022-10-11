import java.util.*;;

public class p6_largest_area_histogram_pepcoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int maxArea = largestAreaHistogram(arr);
        System.out.println(maxArea);
    }

    public static int largestAreaHistogram(int[] arr){
        int[] leftArr = SMETL(arr);
        int[] rightArr = SMETR(arr);

        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            int width = rightArr[i] - leftArr[i] - 1;
            int area = width * arr[i];
            if(area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static int[] SMETL(int[] arr){
        int[] leftBoundary = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        leftBoundary[0] = -1;
        for(int i=1; i<arr.length; i++){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.size()==0){
                leftBoundary[i] = -1;
            }else{
                leftBoundary[i] = st.peek();
            }

            st.push(i);
        }
        return leftBoundary;
    }

    public static int[] SMETR(int[] arr){
        int[] rightBoundary = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rightBoundary[0] = arr.length;
        for(int i=arr.length-2; i>0; i--){
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.size()==0){
                rightBoundary[i] = arr.length;
            }else{
                rightBoundary[i] = st.peek();
            }

            st.push(i);
        }
        return rightBoundary;
    }
}
