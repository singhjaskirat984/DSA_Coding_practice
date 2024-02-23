import java.util.*;

public class p1_size_of_binary_tree {

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

    public static int Size(Node node) {
        if(node  == null) {
            return 0;
        }

        int size = 0;

        int s1 = Size(node.left);
        int s2 = Size(node.right);

        size = size + 1;

        return size + s1 + s2;
    }

    public static int Sum(Node node) {
        if(node==null) {
            return 0;
        }

        int sum = 0; 

        int s1 = Sum(node.left);
        int s2 = Sum(node.right);

        sum = node.data + s1 + s2;

        return sum;
    }

    public static int Max(Node node) {
        if(node==null) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        int m1 = Max(node.left);
        int m2 = Max(node.right);

        int m3 = Math.max(m1, m2);

        max = Math.max(node.data, m3);

        return max;
    }

    public static int Height(Node node) {
        if(node == null) {
            return -1;
        }

        int height = -1;

        int h1 = Height(node.left);
        int h2 = Height(node.right);

        height = Math.max(h1, h2);

        height = height + 1;

        return height;
    }

    public static void main(String[] args) {

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);

        Pair rootPair = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();

        st.push(rootPair);

        int idx=0;

        while(st.size()>0) {
            Pair top = st.peek();

            if(top.state==1) {
                idx++;
                if(arr[idx]!=null) {
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            }else if(top.state==2) {
                idx++;
                if(arr[idx]!=null) {
                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn, 1);
                    st.push(rp);
                }else{
                    top.node.right = null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }

        int size = Size(root);
        System.out.println(size);

        int sum = Sum(root);
        System.out.println(sum);

        int max = Max(root);
        System.out.println(max);

        int height = Height(root);
        System.out.println(height);
    }
}
