

import java.util.*;

public class p11_generic_tree_remove_leaves {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

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

        RemoveLeaves(root);
        LevelOrderLineWise(root);
    }

    public static void LevelOrderLineWise(Node node) {
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> childQ = new ArrayDeque<>();

        mainQ.add(node);

        while(mainQ.size()>0) {
            Node n = mainQ.remove();

            System.out.print(n.data + ", ");

            for(Node child: n.children) {
                childQ.add(child);
            }

            if(mainQ.size()==0) {
                mainQ = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void RemoveLeaves(Node node) {

        for (int i = node.children.size() - 1; i >=0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(i);
            }
        }

        for (Node child : node.children) {
            RemoveLeaves(child);
        }
    }
}
