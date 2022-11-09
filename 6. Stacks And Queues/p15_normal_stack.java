import java.util.*;

public class p15_normal_stack {

    public static class CustomStack{
        int[] data;
        int tos;

        CustomStack(int cap){
            data = new int[cap];
            tos = -1;
        }

        void push(int val){
            if(tos == data.length-1){
                System.out.println("Stack overflow");
            }else{
                tos++;
                data[tos] = val;
            }
        }

        int pop(){
            if(tos==-1){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val = data[tos];
                tos--;
                return val;
            }
        }

        int size(){
            return tos+1;
        }

        int top(){
            if(tos == -1){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return data[tos];
            }
        }

        void display(){
            for(int i=tos; i>=0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        CustomStack st = new CustomStack(n);

        String str = scn.nextLine();
        
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }else if(str.startsWith("pop")){
                int val = st.pop();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("top")){
                int val = st.top();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("size")){
                System.out.println(st.size());
            }else if(str.startsWith("display")){
                st.display();
            }
            str = scn.nextLine();
        }
    }
}
