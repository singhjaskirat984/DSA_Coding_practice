import java.util.*;

public class p23_queue_to_stack_adapter_pop_efficient {

    public static class queToStackAdapterPopEff{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        queToStackAdapterPopEff(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        void push(int val){
            while(mainQ.size()>0){
                helperQ.add(mainQ.remove());
            }

            mainQ.add(val);

            while(helperQ.size()>0){
                mainQ.add(helperQ.remove());
            }
        }

        int pop(){
            if(mainQ.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return mainQ.remove();
            }
        }

        int top(){
            if(mainQ.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return mainQ.peek();
            }
        }

        int size(){
            return mainQ.size();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        queToStackAdapterPopEff qtsapef = new queToStackAdapterPopEff();

        String str = scn.nextLine();
        while(str.equals("quit")){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qtsapef.push(val);
            }else if(str.startsWith("pop")){
                int val = qtsapef.pop();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("top")){
                int val = qtsapef.top();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("size")){
                int val = qtsapef.size();
                if(val!=-1){
                    System.out.println(val);
                }
            }
            str = scn.nextLine();
        }
    }
}
