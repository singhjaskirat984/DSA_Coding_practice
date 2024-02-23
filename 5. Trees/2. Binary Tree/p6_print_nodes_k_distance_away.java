import java.util.*;

public class p6_print_nodes_k_distance_away {
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

    public static ArrayList<Node> nodeToRootPath(Node node, int x) {

        if(node==null) {
            return new ArrayList<>();
        }

        if(node.data==x) {
            ArrayList<Node> res = new ArrayList<>();
            res.add(node);
            return res;
        }

        ArrayList<Node> left = nodeToRootPath(node.left, x);
        if(left.size()>0) {
            left.add(node);
            return left;
        }

        ArrayList<Node> right = nodeToRootPath(node.right, x);
        if(right.size()>0) {
            right.add(node);
            return right;
        }

        return new ArrayList<>();
    }

    public static void printKLevelsDown(Node node, int k, Node blocker) {
        if(node==null || k<0 || node==blocker) {
            return;
        }

        if(k==0) {
            System.out.println(node.data);
        }

        printKLevelsDown(node.left, k-1, blocker);
        printKLevelsDown(node.right, k-1, blocker);
    }

    public static void printNodesKDistanceAway(Node node, int data, int kdistance) {
        ArrayList<Node> path = nodeToRootPath(node, data);

        for(int i=0; i<path.size(); i++) {
            printKLevelsDown(path.get(i), kdistance-i, i==0 ? null : path.get(i-1));
        }
    }

    public static void main(String[] args) {
        Node root = constructBinaryTree();

        Scanner scn = new Scanner(System.in);

        int data = scn.nextInt();

        int kdistance = scn.nextInt();

        printNodesKDistanceAway(root, data, kdistance);

    }
}
