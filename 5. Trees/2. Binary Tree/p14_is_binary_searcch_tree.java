import java.util.*;

public class p14_is_binary_searcch_tree {
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

    public static Node constructBinaryTree() {

        Integer[] arr = { 50, 10, 30, null, null, 20, null, null, 40, null, null};;

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

        return root;
    }

    public static class BSTPair {
        boolean isBST;
        int min;
        int max;
    }

    public static BSTPair isBinarySearchTree(Node node) {
        if (node == null) {
            BSTPair bp = new BSTPair();
            bp.isBST = true;
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            return bp;
        }

        BSTPair lp = isBinarySearchTree(node.left);
        BSTPair rp = isBinarySearchTree(node.right);

        BSTPair mp = new BSTPair();

        mp.isBST = lp.isBST && rp.isBST && node.data>=lp.max && node.data<=rp.min;

        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

        return mp;
    }

    public static void main(String[] args) {
        Node root = constructBinaryTree();

        BSTPair p = isBinarySearchTree(root);

        System.out.println(p.isBST);
    }
}
