import java.util.*;

public class p4_node_to_root_path_binary_tree {

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

    public static ArrayList<Integer> NodeToRootPathinBinaryTree(Node node, int x) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.data == x) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(x);
            return a;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ArrayList<Integer> a1 = NodeToRootPathinBinaryTree(node.left, x);

        ArrayList<Integer> a2 = NodeToRootPathinBinaryTree(node.right, x);

        ans.addAll(a1);

        ans.addAll(a2);

        if (ans.size() > 0) {
            ans.add(node.data);
        }

        return ans;
    }

    public static ArrayList<Integer> NodeToRootPathinBinaryTreePepcodingImproved(Node node, int x) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.data == x) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(x);
            return a;
        }

        ArrayList<Integer> a1 = NodeToRootPathinBinaryTree(node.left, x);
        if(a1.size()>0){
            a1.add(node.data);
            return a1;
        }

        ArrayList<Integer> a2 = NodeToRootPathinBinaryTree(node.right, x);
        if(a2.size()>0){
            a2.add(node.data);
            return a2;
        }

        return new ArrayList<>();
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

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        ArrayList<Integer> ans = NodeToRootPathinBinaryTree(root, x);
        System.out.println(ans);

        ArrayList<Integer> ans2 = NodeToRootPathinBinaryTreePepcodingImproved(root, x);
        System.out.println(ans2);
    }
}
