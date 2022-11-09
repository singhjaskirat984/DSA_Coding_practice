import java.util.*;

public class p17_minimum_stack_1 {

    public static class MinStack{
        Stack<Integer> allData;
        Stack<Integer> minData;

        MinStack(){
            allData = new Stack<>();
            minData = new Stack<>();
        }

        void push(int val){
            allData.push(val);
            if(minData.size()==0 || val<=minData.peek()){
                minData.push(val);
            }
        }

        int pop(){
            int val = allData.pop();
            if(val == minData.peek()){
                minData.pop();
            }
            return val;
        }

        int top(){
            return allData.peek();
        }

        int size(){
            return allData.size();
        }

        int min(){
            return minData.peek();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MinStack st = new MinStack();
        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }else if(str.startsWith("pop")){
                st.pop();
                System.out.println(str);
            }else if(str.startsWith("size")){
                st.size();
            }else if(str.startsWith("top")){
                st.top();
            }else if(str.startsWith("min")){
                st.min();
            }
            str = scn.nextLine();
        }
    }   


}
