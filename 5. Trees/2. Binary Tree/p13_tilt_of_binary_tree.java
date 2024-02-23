import java.util.*;

public class p13_tilt_of_binary_tree {

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

        Integer[] arr = { 50, 10, 30, null, null, 20, null, null, 40, null, null};

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

    public static void TraversalsInBinaryTree(Node node) {
        String pre = "";
        String in = "";
        String post = "";

        Stack<Pair> st = new Stack<>();
        Pair rootPair = new Pair(node, 1);

        st.push(rootPair);

        while(st.size()>0) {
            Pair top = st.peek();

            if(top.state==1) {
                pre = pre + top.node.data + " ";

                if(top.node.left!=null) {
                    Pair p = new Pair(top.node.left, 1);
                    st.push(p);
                }

                top.state++;
            }else if(top.state==2) {
                in = in + top.node.data + " ";

                if(top.node.right!=null) {
                    Pair p = new Pair(top.node.right, 1);
                    st.push(p);
                }

                top.state++;
            }else {
                post = post + top.node.data + " ";
                st.pop();
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

    private static  int tilt = 0;

    public static int tiltOfBinaryTree(Node node) {
        if(node==null) {
            return 0;
        }

        int ls = tiltOfBinaryTree(node.left);
        int rs = tiltOfBinaryTree(node.right);

        int sum = ls + rs + node.data;

        tilt = tilt + Math.abs(ls-rs);

        return sum;
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



    public static void main(String[] args) {
        Node root = constructBinaryTree();

        // TraversalsInBinaryTree(root);

        // LevelOrderLinewiseBinaryTree(root);


        tiltOfBinaryTree(root);

        System.out.println(tilt);
    }
}
