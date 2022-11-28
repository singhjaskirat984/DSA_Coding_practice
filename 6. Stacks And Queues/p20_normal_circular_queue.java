import java.util.*;;


public class p20_normal_circular_queue {

    public static class CustomCircularQueue{
        int[] data;
        int size;
        int front;

        CustomCircularQueue(int cap){
            data = new int[cap];
            size = 0;
            front = 0;
        }

        public void add(int val){
            if(size == data.length){
                System.out.println("Queue overflow");
            }else{
                int rear = (front + size) % data.length ;
                data[rear] = val;
                size++;
            }
        }

        public int remove(){
            if(size <= 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                front = (front + 1) % data.length;
                size--;
                return ans;
            }
        }

        public int peek(){
            if(size <= 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                int ans = data[front];
                return ans;
            }
        }

        // front = 2, i=0, 2+0 = 2, 2%5 = 2 print data[2]
        // front = 2, i=1, 2+1 = 3, 3%5 = 3 print data[3]
        // front = 2, i=2, 2+2 = 4, 4&5 = 4 print data[4]
        // front = 2, i=3, 2+3 = 5, 5%5 = 0 print data[0]
        // front = 2, i=4, 2+4 = 6, 6%5 = 1 print data[1]
        public void display(){
            for(int i=0; i<size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        public int size(){
            return size;
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
