import java.util.*;

public class p22_queue_to_stack_adapter {

    public static class QueueToStackAdapter{
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        QueueToStackAdapter(){
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        void push(int val){
            if(mainQ.size()==0){
                System.out.println("Stack overflow");
            }else{
                mainQ.add(val);
            }
        }

        int top(){
            if(mainQ.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                while(mainQ.size()>1){
                    helperQ.add(mainQ.remove());
                }

                // retrieve and put last digit in helperQ
                int val = mainQ.remove();
                helperQ.add(val);

                while(helperQ.size()>0){
                    mainQ.add(helperQ.remove());
                }

                return val;
            }
        }

        int pop(){
            if(mainQ.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                while(mainQ.size()>1){
                    helperQ.add(mainQ.remove());
                }

                // retrieve and this time don't put last digit in helperQ
                int val = mainQ.remove();

                while(helperQ.size()>0){
                    mainQ.add(helperQ.remove());
                }

                return val;
            }

        }

        int size(){
            if(mainQ.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return mainQ.size();
            }
        }
    }

   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    QueueToStackAdapter qtsa = new QueueToStackAdapter();
    String str = scn.nextLine();
    while(str.equals("quit")){
        if(str.startsWith("push")){
            int val = Integer.parseInt(str.split(" ")[1]);
            qtsa.push(val);
        }else if(str.startsWith("pop")){
            int val = qtsa.pop();
            if(val!=-1){
                System.out.println(val);
            }
        }else if(str.startsWith("top")){
            int val = qtsa.top();
            if(val!=-1){
                System.out.println(val);
            }
        }else if(str.startsWith("size")){
            int val = qtsa.size();
            if(val!=-1){
                System.out.println(val);
            }
        }
        str = scn.nextLine();
    }
   } 
}
