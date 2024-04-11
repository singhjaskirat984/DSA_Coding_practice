import java.util.*;

public class p1_size_sum_min_max_find_in_bst {

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

    public static Node construct(int[] arr, int lo, int hi) {
        if(lo>hi) {
            return null;
        }

        int mid = (lo+hi)/2;

        Node lc = construct(arr, lo, mid-1);
        Node rc = construct(arr, mid+1, hi);

        Node m = new Node(arr[mid], lc, rc);

        return m;
    }
 
    public static void display(Node node) {

        if(node==null) {
            return;
        }

        String str = "";
        String left = node.left==null ? "." : node.left.data + "";
        String right = node.right==null ? "." : node.right.data + "";
        str = str + left + " <- " + node.data + " -> " + right;
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
        if(node==null) {
            return 0;
        }

        int s1 = size(node.left);
        int s2 = size(node.right);

        int s = s1 + s2 + 1;

        return s;
    }
 
    public static int sum(Node node) {
        if(node==null) {
            return 0;
        }

        int s1 = sum(node.left);
        int s2 = sum(node.right);

        int s = s1 + s2 + node.data;

        return s;
    }

    public static int max(Node node) {
        if(node.right==null) {
            return node.data;
        }

        int right = max(node.right);

        return right;
    }

    public static int min(Node node) {
        if(node.left==null ) {
            return node.data;
        }

        int left = min(node.left);

        return left;
    }

    public static boolean find(Node node, int x) {
        if(node==null) {
            return false;
        }

        if(x<node.data) {
            // go to left
            boolean left = find(node.left, x);  
            return left;
        }else if(x==node.data) {
            return true;
        }else {
            boolean right = find(node.right, x);
            return right;
        }
    }

    public static void main(String[] args) {
        // sorted array
        int[] arr = {12, 25, 37, 50, 62, 75, 87};

        Node root = construct(arr, 0, arr.length-1);

        display(root);

        int size = size(root);
        System.out.println(size);

        int sum = sum(root);
        System.out.println(sum);

        int min = min(root);
        System.out.println(min);

        int max = max(root);
        System.out.println(max);

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        boolean find = find(root, x);
        System.out.println(find);
        scn.close();

    }
}
