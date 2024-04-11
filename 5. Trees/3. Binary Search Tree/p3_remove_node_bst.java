import java.util.*;

public class p3_remove_node_bst {

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

    public static Node constructBST(int[] arr, int lo, int hi) {
        if(lo>hi) {
            return null;
        }

        int mid = (lo+hi)/2;

        Node left = constructBST(arr, lo, mid-1);
        Node right = constructBST(arr, mid+1, hi);

        Node myNode = new Node(arr[mid], left, right);

        return myNode;
    }

    public static void display(Node node) {
        if(node==null) {
            return;
        }

        String left = node.left==null ? "." : node.left.data + "";
        String right = node.right==null ? "." : node.right.data + "";

        String str = left + " <- " + node.data + " -> " + right;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }


    public static int maxBST(Node node) {
        if(node.right==null) {
            return node.data;
        }

        int m = maxBST(node.right);

        return m;
    }

    public static int minBST(Node node) {
        if(node.left==null) {
            return node.data;
        }

        int m = maxBST(node.left);

        return m;
    }

    public static boolean findBST(Node node, int x) {
        if(node==null) {
            return false;
        }

        if(x<node.data) {
            return findBST(node.left, x);
        }else if(x>node.data) {
            return findBST(node.right, x);
        }else {
            return true;
        }
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

    public static Node removeNodeBST(Node node, int data) {
        if(node==null) {
            return null;
        }

        if(data<node.data) {
            node.left = removeNodeBST(node.left, data);
        }else if(data>node.data) {
            node.right = removeNodeBST(node.right, data);
        }else {
            // work
            if(node.left!=null && node.right!=null) {
                int lmax = maxBST(node.left); // find max from left side
                node.data = lmax; // replace current node data with lmax
                node.left = removeNodeBST(node.left, lmax); // remove lmax node
                return node; // return modified node
            } else if(node.left!=null) {
                return node.left;
            }else if(node.right!=null) {
                return node.right;
            }else {
                return null;
            }
        }

        return node;
    }


    public static void main(String[] args) {
                // sorted integer array
        int[] arr = {12, 25, 30, 37, 40, 50, 62, 75, 87};
        // int[] arr = {12, 25, 37, 50, 62, 75, 87};

        Node root = constructBST(arr, 0, arr.length-1);

        display(root);

        removeNodeBST(root, 87);

        display(root);
    }
}
