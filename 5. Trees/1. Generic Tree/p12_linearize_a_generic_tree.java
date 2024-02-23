import java.util.*;

public class p12_linearize_a_generic_tree {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1) {
                st.pop();
            }else{
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

        linearize(root);
    }

    public static void linearize(Node node) {
        for(Node child: node.children) {
            linearize(child);
        }

        while(node.children.size()>1) {
            Node lastChild = node.children.remove(node.children.size()-1);

            Node secondLastChild = node.children.get(node.children.size()-1);

            Node secondLastTail = getTail(secondLastChild);

            secondLastTail.children.add(lastChild);
        }
    }

    public static Node getTail(Node node) {
        while(node.children.size()==1) {
            node = node.children.get(0);
        }

        return node;
    }
}
