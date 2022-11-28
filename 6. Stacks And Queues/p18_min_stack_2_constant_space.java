import java.util.*;

public class p18_min_stack_2_constant_space {

    public static class minStack2{
        Stack<Integer> allData;
        int min;

        minStack2(){
            allData = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        void push(int val){
            if(allData.size()<=0){
                allData.push(val);
                min = val;
            }else if(val>=min){
                allData.push(val);
            }else{
                int changedVal = val + (val - min); // val is current min and min is previous min
                allData.push(changedVal);
                min = val; // min is updated after storing the previous min as a fake val in the stack
            }
        }

        int pop(){
            int val = allData.pop();
            if(val >= min){
                // normal case pop i.e not min which means its either greater or equal to min  --> this is non min case
                return val;
            }else{
                int currentPop = min; // taking current popped val from min bcoz the stack contains the fake val in it as of now bcoz its mincase
                // less than case which means we have popped the min case(v+v-min) : v = was the current min in that case, min = was the previous min in that current case
                int extractPrevMin = 2*min - val; // min = 2 * originalValStoredInMin - (v+v-min) : min = current min, val = fake val containing prev min was put in place of current min
                min = extractPrevMin;
                return currentPop;
            }
        }

        int top(){
            if(allData.peek()>=min){
                return allData.peek();
            }else{
                return min;
            }
        }

        int size(){
            return allData.size();
        }

        int min(){
            return min;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        minStack2 st = new minStack2();

        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }else if(str.startsWith("pop")){
                System.out.println(st.pop());
            }else if(str.startsWith("top")){
                System.out.println(st.top());
            }else if(str.startsWith("size")){
                System.out.println(st.size());
            }else if(str.startsWith("min")){
                System.out.println(st.min());
            }
            str = scn.nextLine();
        }
    }
}
