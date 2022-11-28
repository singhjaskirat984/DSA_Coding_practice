import java.util.*;;

public class temp {
    public static class CustomCircularQueue{
        int[] data;
        int size;
        int front;

        CustomCircularQueue(int cap){
            data = new int[cap];
            size = 0;
            front = 0;
        }

        int size() {

            return size;
          }
      
          void display() {
      
            for (int i = 0; i < size; i++) {
              int idx = (front + i) % data.length;
              System.out.print(data[idx] + " ");
            }
            System.out.println();
          }
      
          void add(int val) {
      
            if (size == data.length) {
              System.out.println("Queue overflow");
            } else {
              int idx = (front + size) % data.length;
              data[idx] = val;
              size++;
            }
          }
      
          int remove() {
      
            if (size == 0) {
              System.out.println("Queue underflow");
              return -1;
            } else {
              int val = data[front];
      
              front = (front + 1) % data.length;
              size--;
      
              return val;
            }
          }
      
          int peek() {
      
            if (size == 0) {
              System.out.println("Queue underflow");
              return -1;
            } else {
              int val = data[front];
              return val;
            }
          }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        CustomCircularQueue cque = new CustomCircularQueue(n);
        String str = scn.nextLine();
        while(str.equals("quit") == false){
            if(str.startsWith("add")){
                cque.add(Integer.parseInt(str.split(" ")[1]));
            }else if(str.startsWith("remove")){
                int val = cque.remove();
                if(val != -1){
                    System.out.println(val);
                }
            }else if(str.startsWith("display")){
                cque.display();
            }else if(str.startsWith("size")){
                System.out.println(cque.size);
            }else if(str.startsWith("peek")){
                int peek = cque.peek();
                if(peek != -1){
                    System.out.println(peek);
                }
            }
            str = scn.nextLine();
        }
    }
}