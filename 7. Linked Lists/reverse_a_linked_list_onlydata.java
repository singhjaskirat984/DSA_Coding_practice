

public class reverse_a_linked_list_onlydata {

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

        private Node nodeAtIndex(int idx) {
            Node temp = head;

            for(int i=0; i<idx; i++) {
                temp = temp.next;
            }

            return temp;
        }

        public void reverseLL() {
            // Two pointer approach
            int li = 0;
            int ri = size-1;

            while(li<ri) {
                Node left = nodeAtIndex(li);
                Node right = nodeAtIndex(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }


    }

    public static void main(String[] args) {
        
        LinkedList LL = new LinkedList();

        for(int i=0; i<10; i++) {
            LL.addLast(i);
        }

        LL.display();

        // System.out.println(LL.Size());

        LL.reverseLL();

        LL.display();

        // System.out.println(LL.Size());


    }
}
