import java.util.*;

public class p2_level_order_traversal_linewise_binary_tree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void LevelOrderLinewiseBinaryTree(Node node) {
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> childQ = new ArrayDeque<>();

        mainQ.add(node);

        while (mainQ.size() > 0) {
            // remove
            node = mainQ.remove();

            // print
            System.out.print(node.data + " ");

            // add children
            if (node.left != null) {
                childQ.add(node.left);
            }

            if (node.right != null) {
                childQ.add(node.right);
            }

            if (mainQ.size() == 0) {
                mainQ = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void LevelOrderLInewiseBinaryTree2(Node node) {
        Queue<Node> mq = new ArrayDeque<>();

        mq.add(node);

        while (mq.size() > 0) {
            int count = mq.size();

            for (int i = 0; i < count; i++) {
                // remove
                node = mq.remove();

                // print
                System.out.print(node.data + " ");

                // add
                if (node.left != null) {
                    mq.add(node.left);
                }

                if (node.right != null) {
                    mq.add(node.right);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = new Node(arr[0], null, null);

        Pair rootPair = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();

        st.push(rootPair);

        int idx = 0;

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                // add next element to the left of top if exists
                idx++;
                if (arr[idx] != null) {
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                // add next element to the right of top if exists
                idx++;
                if (arr[idx] != null) {
                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }

        // Level order linewise func call
        LevelOrderLinewiseBinaryTree(root);

        //2nd Approach
        LevelOrderLInewiseBinaryTree2(root);
    }
}
