import java.util.*;

public class p21_dynamic_queue {

    public static class DynamicQueue{
        int[] data;
        int size;
        int front;

        DynamicQueue(int cap){
            data = new int[cap];
            front = 0;
            size = 0;
        }

        void add(int val){
            if(size==data.length){
                // make new array of double the size of data array
                int[] ndata = new int[2*data.length];
                // copy data from data to ndata
                for(int i=0; i<size; i++){
                    // take data from circular queue to ndata array
                    int rear = (front + i) % data.length;
                    ndata[i] = data[rear];
                }
                // point data array to ndata array
                data = ndata;
                front = 0;

                // add new value to data = ndata array
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }else{
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        int size(){
            return size;
        }

        int remove(){
            if(size==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                front = (front + 1) % data.length;
                size--;
                return ans;
            }
        }

        int peek(){
            if(size==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                return ans;
            }
        }

        void display(){
            for(int i=0; i<size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        DynamicQueue dque = new DynamicQueue(n);
        String str = scn.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                dque.add(val);
            }else if(str.startsWith("remove")){
                int val = dque.remove();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("size")){
                int val = dque.size();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("peek")){
                int val = dque.peek();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if(str.startsWith("display")){
                dque.display();
            }
        }
    }
}
