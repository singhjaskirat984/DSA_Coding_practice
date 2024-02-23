import java.util.*;

public class p5_print_k_levels_down_binary_tree {

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

    public static ArrayList<ArrayList<Integer>> LevelOrderLinewiseBT(Node node) {
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> childQ = new ArrayDeque<>();

        mainQ.add(node);

        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();

        while(mainQ.size()>0) {
            // remove
            node = mainQ.remove();

            // print -- add this to a arraylist
            innerList.add(node.data);

            // add children to childQ
            if(node.left!=null) {
                childQ.add(node.left);
            }
            if(node.right!=null) {
                childQ.add(node.right);
            }

            if(mainQ.size()==0) {
                mainQ = childQ;
                childQ = new ArrayDeque<>();
                finalList.add(innerList);
                innerList = new ArrayList<>();
            }
        }

        return finalList;
    }

    public static void printKlevelsDown(Node node, int k){
        if(node==null || k<0) {
            return;
        }

        if(k==0) {
            System.out.println(node.data);
        }

        printKlevelsDown(node.left, k-1);
        printKlevelsDown(node.right, k-1);
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
        int k = scn.nextInt();

        ArrayList<ArrayList<Integer>> finalList = LevelOrderLinewiseBT(root);

        ArrayList<Integer> kLevelNodes = finalList.get(k);

        System.out.println(kLevelNodes);

        printKlevelsDown(root, k);
    }
}
