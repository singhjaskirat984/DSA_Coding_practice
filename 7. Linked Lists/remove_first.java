public class remove_first {

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

        public void display() {
            Node node = new Node();
            node = head;

            while (node != null) {
                System.out.print(node.data + ", ");
                node = node.next;
            }

            System.out.println();
        }

        public int Size() {
            return size;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else if (idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node node = head;

                for (int i = 0; i < idx; i++) {
                    node = node.next;
                }

                return node.data;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = null;
        ll.tail = null;
        ll.size = 0;

        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }

        ll.display();

        int size = ll.Size();
        System.out.println(size);

        ll.removeFirst();

        ll.display();

        int s = ll.Size();
        System.out.println(s);

        int first = ll.getFirst();
        System.out.println(first);

        int last = ll.getLast();
        System.out.println(last);

        int getat = ll.getAt(4);
        System.out.println(getat);

        int getat1 = ll.getAt(9);
        System.out.println(getat1);

        int getat2 = ll.getAt(10);
        System.out.println(getat2);
    }

}
