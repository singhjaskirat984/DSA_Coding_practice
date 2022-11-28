import java.util.*;

public class p24_stack_to_queue_adapter {

    public static class stackToQueAdapterAddEff{
        Stack<Integer> mainStack;
        Stack<Integer> helperStack;

        stackToQueAdapterAddEff(){
            mainStack = new Stack<>();
            helperStack = new Stack<>();
        }

        void add(int val){
            mainStack.push(val);
        }

        int remove(){
            if(mainStack.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                while(mainStack.size()>0){
                    helperStack.push(mainStack.pop());
                }

                int val = helperStack.pop();

                while(helperStack.size()>0){
                    mainStack.push(helperStack.pop());
                }

                return val;
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
                while(mainStack.size()>1){
                    helperStack.push(mainStack.pop());
                }

                int val = mainStack.pop();
                helperStack.push(val);

                while(helperStack.size()>0){
                    mainStack.push(helperStack.pop());
                }

                return val;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        stackToQueAdapterAddEff stqaef = new stackToQueAdapterAddEff();
        
        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                stqaef.add(val);
            }else if(str.startsWith("remove")){
                int val = stqaef.remove();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("size")){
                int val = stqaef.size();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("peek")){
                int val = stqaef.peek();
                if(val!=-1){
                    System.out.println(val);
                }
            }
        }
    }
}
