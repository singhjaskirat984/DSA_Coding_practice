import java.util.*;

public class p7_level_order_linewise_zig_zag {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrderLinewiseZigZag(Node node) {
        Stack<Node> ms = new Stack<>();
        ms.push(node);

        Stack<Node> cs  = new Stack<>();
        int level = 1;

        while(ms.size()>0){
            node = ms.pop();
            System.out.print(node.data + " ");

            if(level%2==1){
                for(int i=0; i<node.children.size(); i++){
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            } else {
                for(int i=node.children.size()-1; i>=0; i--){
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }

            if(ms.size()==0){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    public static Queue<Node> queueReversal(Queue<Node> q){
        Stack<Node> st = new Stack<>();

        while(q.size()>0){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };

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
        levelOrderLinewiseZigZag(root);
    }
}
