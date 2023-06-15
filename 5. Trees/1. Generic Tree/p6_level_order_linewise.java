import java.util.*;

public class p6_level_order_linewise {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrderLinewise(Node node) {
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> childQ = new ArrayDeque<>();
        mainQ.add(node);

        while (mainQ.size() > 0) {
            node = mainQ.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children) {
                childQ.add(child);
            }

            if (mainQ.size() == 0) {
                mainQ = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, 40, 100, -1, -1, -1 };

        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        levelOrderLinewise(root);
    }
}
