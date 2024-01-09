package Trees;
import java.util.*;

public class generic_tree_level_order {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==-1) {
                st.pop();
            }else {
                Node t = new Node();
                t.data = arr[i];

                if(st.size()>0) {
                    st.peek().children.add(t);
                }else{
                    root = t;
                }

                st.push(t);
            }
        }

        LevelOrder(root);
    }

    public static void LevelOrder(Node node) {
        Queue<Node> Q = new ArrayDeque<>();

        Q.add(node);

        while(Q.size()>0) {
            Node n = Q.remove();

            System.out.print(n.data + ", ");

            for(Node child: n.children) {
                Q.add(child);
            }
        }

    }
}
