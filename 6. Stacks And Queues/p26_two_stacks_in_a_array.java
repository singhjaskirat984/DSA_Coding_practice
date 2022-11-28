import java.util.*;

public class p26_two_stacks_in_a_array {

    public static class customStack{
        int[] data;
        int tos1;
        int tos2;

        customStack(int cap){
            data = new int[cap];
            tos1 = -1;
            tos2 = data.length;
        }

        void push1(int val){
            if(tos2==tos1+1){
                System.out.println("Stack overflow");
            }else{
                tos1++;
                data[tos1] = val;
            }
        } 

        void push2(int val){
            if(tos2==tos1+1){
                System.out.println("Stack overflow");
            }else{
                tos2--;
                data[tos2] = val;
            }
        }

        int pop1(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val = data[tos1];
                tos1--;
                return val;
            }
        }

        int pop2(){
            if(size2() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val = data[tos2];
                tos2++;
                return val;
            }
        }

        int size1(){
            return tos1+1;
        }

        int size2(){
            return data.length-tos2;
        }

        int top1(){
            if(size1() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val = data[tos1];
                return val;
            }
        }

        int top2(){
            if(size2()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                int val = data[tos2];
                return val;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        customStack st = new customStack(n);
        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("push1")){

            }else if(str.startsWith("pop1")){

            }else if(str.startsWith("size1")){
                
            }else if(str.startsWith("top1")){

            }else if(str.startsWith("push2")){

            }else if(str.startsWith("pop2")){

            }else if(str.startsWith("size2")){

            }else if(str.startsWith("top2")){

            }
            str = scn.nextLine();
        }
    }
}
