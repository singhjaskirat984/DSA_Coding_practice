public class add_last_display_and_size {

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
            Node node = new Node();
            node = head;

            while (node != null) {
                System.out.print(node.data + ", ");
                node = node.next;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = null;
        // ll.tail = null;
        // ll.size = 0;

        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }

        ll.display();

        int size = ll.size;
        System.out.println(size);

    }
}
