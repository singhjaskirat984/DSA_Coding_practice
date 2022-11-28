import java.util.*;

public class p19_normal_linear_queue {

    public static class CustomLinearQueue{

        int[] data;
        int front;
        int size;

        public CustomLinearQueue(int cap){
            data = new int[cap];
            front = 0;
            size = 0;
        }

        public void add(int val){
            if(size == data.length){
                System.out.println("Queue overflow");
            }else{
                int rear = front + size;
                data[rear] = val;
                size++;
            }
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                front++;
                size--;
                return ans;
            }
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                return ans;
            }
        }

        public int size(){
            return size;
        }

        public void display(){
            for(int i=front; i<size; i++){
                System.out.print(data[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        CustomLinearQueue que = new CustomLinearQueue(n);

        String str = scn.nextLine();
        while(str.equals("quit") == false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                que.add(val);
            }else if(str.startsWith("remove")){
                int ans = que.remove();
                if(ans!=-1){
                    System.out.println(ans);
                }
            }else if(str.startsWith("peek")){
                int ans = que.peek();
                if(ans!=-1){
                    System.out.println(ans);
                }
            }else if(str.startsWith("display")){
                que.display();;
            }else if(str.startsWith("size")){
                System.out.println(que.size);
            }
            str = scn.nextLine();
        }
    }
}
