import java.util.*;

public class p7_path_to_leaf_from_root_in_range {

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

    public static void pathToLeafFromRooInRange(Node node, int sum, String path, int lo, int hi) {
        if(node==null) {
            return;
        }

        if(node.left==null && node.right==null) {
            sum +=node.data;
            if(sum>=lo && sum<=hi) {
                System.out.println(path + " " + node.data);
            }
            return;
        }

        pathToLeafFromRooInRange(node.left, sum+node.data, path + " " + node.data, lo, hi);
        pathToLeafFromRooInRange(node.right, sum+node.data, path + " " + node.data, lo, hi);
    }


    public static void main(String[] args) {
        Node root = constructBinaryTree();

        Scanner scn = new Scanner(System.in);

        int lo = scn.nextInt();

        int hi = scn.nextInt();

        pathToLeafFromRooInRange(root, 0, "", lo, hi);
    }
}
