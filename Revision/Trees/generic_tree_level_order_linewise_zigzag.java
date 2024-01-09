package Trees;
import java.util.*;

public class generic_tree_level_order_linewise_zigzag {

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

        LevelOrderLinewiseZigZag(root);
    }

    public static void LevelOrderLinewiseZigZag(Node node) {
        Stack<Node> mainStack =  new Stack<>();
        Stack<Node> childStack = new Stack<>();

        mainStack.push(node);
        int level = 1;

        while(mainStack.size()>0) {
            Node n = mainStack.pop();

            System.out.print(n.data + " "); 

            if(level%2==1) {
                for(int i=0; i<n.children.size(); i++) {
                    childStack.push(n.children.get(i));
                }
            }else{
                for(int i=n.children.size()-1; i>=0; i--) {
                    childStack.push(n.children.get(i));
                }
            }

            if(mainStack.size()==0) {
                mainStack = childStack;
                childStack = new Stack<>();
                System.out.println();
                level++;
            }
            
        }
    }
}
