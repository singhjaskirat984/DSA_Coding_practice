import java.util.*;

public class p15_lowest_common_ancestor {

    public static class Node {
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

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        int lcw = lowestCommonAncestor(root, x, y);

        System.out.println(lcw);

        scn.close();
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int x) {
        for (Node child : node.children) {
            ArrayList<Integer> path = nodeToRootPath(child, x);
            if (path.size() > 0) {
                path.add(node.data);
                return path;
            }
        }

        if (node.data == x) {
            ArrayList<Integer> p = new ArrayList<>();
            p.add(node.data);
            return p;
        }

        return new ArrayList<>();
    }

    public static int lowestCommonAncestor(Node node, int x, int y) {
        ArrayList<Integer> path1 = nodeToRootPath(node, x);
        ArrayList<Integer> path2 = nodeToRootPath(node, y);

        System.out.println(path1);
        System.out.println(path2);

        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while (i >= 0 && j >= 0 && path1.get(i) == path2.get(j)) {
            i--;
            j--;
        }

        return path1.get(i + 1);
    }

}
