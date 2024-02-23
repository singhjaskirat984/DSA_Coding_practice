public class reverse_a_linked_list_pointer_iterative {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int Size() {
            return size;
        }

        public void display() {
            Node node = head;

            while (node != null) {
                System.out.print(node.data + ", ");
                node = node.next;
            }

            System.out.println();
        }

        public void reversePI() {
            Node prev = null;
            Node curr = head;

            while(curr!=null) {
                Node next = curr.next;

                curr.next = prev;

                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        
        LinkedList LL = new LinkedList();

        for(int i=0; i<10; i++) {
            LL.addLast(i);
        }

        LL.display();

        // System.out.println(LL.Size());

        LL.reversePI();

        LL.display();

        // System.out.println(LL.Size());


    }
}
