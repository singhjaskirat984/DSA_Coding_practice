import java.util.*;

public class p12_diametre_binary_tree {

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

        return root;
    }

    public static class Diapair {
        int ht; 
        int dia;
    }

    public static Diapair diameterBinaryTree(Node node) {
        if(node==null) {
            Diapair bp = new Diapair();
            bp.ht = -1;
            bp.dia = 0;

            return bp;
        }

        Diapair ld = diameterBinaryTree(node.left); // factor 1
        Diapair rd = diameterBinaryTree(node.right); // factor 2

        Diapair mp = new Diapair();
        
        mp.ht = Math.max(ld.ht, rd.ht) + 1;
        int fes = ld.ht + rd.ht + 2; // factor 3 // smallest problem

        mp.dia = Math.max(fes, Math.max(ld.dia, rd.dia)); // dia will be max of factor1 factor2 factor3

        return mp;
    }



    public static void main(String[] args) {
        Node root = constructBinaryTree();

        diameterBinaryTree(root);
    }
}
