import java.util.*;

public class p25_stack_to_queue_adapter_pop_effiecient {

    public static class stackToQueAdapterPopEff{
        Stack<Integer> mainStack;
        Stack<Integer> helperStack;

        stackToQueAdapterPopEff(){
            mainStack = new Stack<>();
            helperStack = new Stack<>();
        }

        void add(int val){
            while(mainStack.size()>0){
                helperStack.push(mainStack.pop());
            }

            mainStack.push(val);

            while(helperStack.size()>0){
                mainStack.push(helperStack.pop());
            }
        }

        int remove(){
            if(mainStack.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                return mainStack.pop();
            }
        }

        int size(){
            return mainStack.size();
        }

        int peek(){
            if(mainStack.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                return mainStack.peek();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        stackToQueAdapterPopEff stqapf = new stackToQueAdapterPopEff();
        
        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                stqapf.add(val);
            }else if(str.startsWith("remove")){
                int val = stqapf.remove();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("size")){
                int val = stqapf.size();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("peek")){
                int val = stqapf.peek();
                if(val!=-1){
                    System.out.println(val);
                }
            }
        }
    }
}
