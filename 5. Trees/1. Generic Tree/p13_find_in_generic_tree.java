import java.util.*;

public class p13_find_in_generic_tree {

    public static class Node {
        int data;
        ArrayList<Node> chidlren = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;

        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==-1) {
                st.pop();
            }else{
                Node t = new Node();
                t.data = arr[i];

                if(st.size()>0) {
                    st.peek().chidlren.add(t);
                }else{
                    root = t;
                }
                st.push(t);
            }
        }

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        Boolean ans = find(root, x);
        
        System.out.println(ans);
        scn.close();
    }

    public static Boolean find(Node node, int x) {

        for(Node child: node.chidlren) {
            Boolean res = find(child, x);
            if(res==true) {
                return true;
            }
        }

        if(node.data==x) {
            return true;
        }

        return false;
    }
}
